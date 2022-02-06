package main.practice.unit5.exam;

/**
 * @author ManhKM on 1/31/2022
 * @project introduction-java-variable-function-main
 */
public abstract class BaseFile implements ShowInfo{
    private String fileName;
    private String fileExtension;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    @Override
    public void displayInfo(){
        System.out.println(getFileName() +" \t\t\t\t "+ getFileExtension());
    }
}
