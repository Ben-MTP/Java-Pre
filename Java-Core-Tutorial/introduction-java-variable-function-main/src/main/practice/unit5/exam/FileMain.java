package main.practice.unit5.exam;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 1/31/2022
 * @project introduction-java-variable-function-main
 * Mục đích là cho việc đọc file khác nhau
 * Với bài cơ bản thì mong muốn là get được tên file+extension của chúng thôi
 * Nếu dùng Interface thì dùng cho dạng triển khai method chung
 * Phải duyệt hết file thì mới in ra
 *
 */
public class FileMain {

    public static void main(String[] args) {
        String yourPath = "E:\\1_CODING\\LearnJava\\Java-Pre\\Java-CoreTutorial\\introduction-java-variable-function-main\\data";
        showListFile(lookup(yourPath));
    }

    /**
     * Thực hiện việc đọc toàn bộ các file có trong thư mục theo đường dẫn path
     * TH1: Bỏ qua việc đọc nội dung file -> chỉ get ra tên và extension của file thôi.
     *
     * TH2: Updating...
     *
     * @param yourPath
     * @return
     */
    public static List<BaseFile> lookup(String yourPath){
        File directory = new File(yourPath);

        List<BaseFile> listFile = new ArrayList<>();

        File[] files = directory.listFiles();
        for (File file: files) {

            // Convert the file name into String:
            String fileName = file.getName().toString();
            int index = fileName.lastIndexOf('.');
            if(index > 0){
                String extension = fileName.substring(index + 1);
                if(extension.equals("pdf")){
                    // call method get of pdf
                    FilePDF filePDF = new FilePDF();
                    filePDF.setFileName(fileName);
                    filePDF.setFileExtension(extension);
                    listFile.add(filePDF);
                } else if(extension.equals("docx")){
                    // call method get of docx
                    FileDoc fileDoc = new FileDoc();
                    fileDoc.setFileName(fileName);
                    fileDoc.setFileExtension(extension);
                    listFile.add(fileDoc);
                } else if(extension.equals("jpg")){
                    // call method get of jpg
                    FileJPG fileJPG = new FileJPG();
                    fileJPG.setFileName(fileName);
                    fileJPG.setFileExtension(extension);
                    listFile.add(fileJPG);
                } else {
                    continue;
                }
            }
        }

        return listFile;
    }

    /**
     * Thực hiện việc show toàn bộ thông tin liên quan đến file đó
     * @param listFile
     */
    public static void showListFile(List<BaseFile> listFile){
        for (BaseFile item : listFile){
            item.displayInfo();
        }
    }
}
