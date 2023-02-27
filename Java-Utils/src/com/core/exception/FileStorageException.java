package com.core.exception;

/**
 * @author ManhKM on 6/20/2022
 * @project Java-Utils
 */
public class FileStorageException extends RuntimeException {
    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}