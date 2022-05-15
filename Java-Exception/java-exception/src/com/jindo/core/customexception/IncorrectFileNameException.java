package com.jindo.core.customexception;

/**
 * @author ManhKM on 5/15/2022
 * @project java-exception
 * -----
 * Khởi tạo một CustomException dùng cho mục đích xử lý các logic riêng
 */
public class IncorrectFileNameException extends Exception{

    public IncorrectFileNameException(String errorMessage){
        super(errorMessage);
    }
}
