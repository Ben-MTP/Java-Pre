package com.msoft.core.monitor.impl;

import com.msoft.core.monitor.FileWatcher;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FileWatcherImpl implements FileWatcher {
    /**
     * Xử lý các vấn đề monitor file
     * Đường dẫn tuyệt đối của file + Thời gian sửa đổi lần cuối
     *
     * @param pathDirectory
     * @return
     */
    @Override
    public Map<String, Long> getFileMonitor(String pathDirectory) {

        // Lưu thông tin của file trong thư mục cần monitor
        Map<String, Long> mapFile = new HashMap<>();

        try {
            // Tạo một WatchService:
            WatchService watchService = FileSystems.getDefault().newWatchService();

            // Đường dẫn đến thư mục muốn theo dõi:
            Path directory = Paths.get(pathDirectory);

            // Đăng ký thư mục với WatchService để bắt sự kiện:
            directory.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);

            // Vòng lặp để bắt sự kiện:
            while (true) {
                WatchKey key = null;
                try {
                    key = watchService.take();
                } catch (InterruptedException e) {
                    return Collections.emptyMap();
                }

                // Xử lý các sự kiện trong WatchKey:
                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();

                    // Kiểm tra loại sự kiện là chỉnh sửa file
                    if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                        // Lấy tên file đã được thay đổi
                        WatchEvent<Path> pathEvent = (WatchEvent<Path>) event;
                        Path path = pathEvent.context();
                        File file = path.toFile();
                        System.out.println("File: " + file.getAbsolutePath() + ", đã được chỉnh sửa: " + file.lastModified());
                        mapFile.put(file.getAbsolutePath(), file.lastModified());
                    }
                }

                // Reset WatchKey để tiếp tục theo dõi sự kiện
                boolean valid = key.reset();

                // Nếu WatchKey không còn hợp lệ (ví dụ: thư mục bị xóa), thoát khỏi vòng lặp
                if (!valid) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyMap();
        }
        return mapFile;
    }

    @Override
    public void run() {
        System.out.println("     execute method run/FileWatcherImpl");
        this.getFileMonitor("data/input/03/03-01");
    }
}
