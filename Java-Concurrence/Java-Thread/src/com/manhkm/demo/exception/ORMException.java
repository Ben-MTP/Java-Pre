package com.manhkm.demo.exception;

/**
 * @author ManhKM on 3/7/2022
 * @project Java-Thread
 */
public class ORMException extends Exception{
    private static final long serialVersionUID = 1L;

    public ORMException() {
        super();
    }

    public ORMException(String message) {
        super(message);
    }

    public ORMException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
