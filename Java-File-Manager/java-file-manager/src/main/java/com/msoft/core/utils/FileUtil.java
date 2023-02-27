package com.msoft.core.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author ManhKM on 9/13/2022
 * @project java-file-manager
 */
public class FileUtil {

    private final Logger logger = LogManager.getLogger(FileUtil.class);

    private String pattern = "register*";

    /**
     * Kiểm tra các file thuộc thư mục path.
     * Lấy ra danh sách các file thuộc thư mục + đường dẫn đó.
     * nếu số lượng file có trong thư mục đó > 0 thì khởi tạo connection
     * Sau khi khởi tạo connection thì đọc toàn bộ danh sách các file đó.
     * @param path - Đường dẫn path đến mơi chứa thư mục cần thực hiện | work/wait/register/retry
     * @param isReload - true | có reload, false | không reload
     */
    public void discovery(String path, boolean isReload) {
        File directory = new File(path);
        File[] fileList = directory.listFiles(new LogFilter(pattern));
        if (fileList == null) {
            return;
        }
        if (fileList.length > 0) {
            logger.info("Stating discovery path: {}, isReload: {}", path, isReload);
        }
        for (File f : fileList) {
            if (f.isFile())
                logger.info(f.getName());
                readFile(f, isReload);
        }

    }

    private void readFile(File f, boolean isReload) {
        BufferedReader reader = null;
        try {
            long s = System.nanoTime();
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
            List<String[]> arrUpdate = new ArrayList<>();

            for (String content; (content = reader.readLine()) != null;) {
                if (!isReload) {
                    // begin logic khong thi reload:
                }

                String[] data = content.split(";");
                String method = data[0];
                String serviceId = data[2];
                String pkgId = data[3];
                String msisdn = data[4];
                String subId = data[5];
                String regDate = data[6];
                String channel = data[7];
                String numReg = data[8];
                String state = data[9];
                String isExtend = data[10];
                String startDate = data[11];
                String endDate = data[12];
                String nextExtend = data[13];
                String pkg = data[14];
                String numFree = data[15];
                String pkgCK = data[16];
                String progId = data[17] == null ? "" : data[17];
                String lastUpdate = data[18];
                String price = data[19];
                String firstTime = data[20];
                String numExt = data[21];
                String subMsisdn = data[22];
                String syntax = data[23] == null ? "" : data[23];
                // String cancelDate = data[24];
                String badDebit = data[25] == null ? "0" : data[25];
                System.out.println(method + " - " + badDebit);
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                }
            }


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
