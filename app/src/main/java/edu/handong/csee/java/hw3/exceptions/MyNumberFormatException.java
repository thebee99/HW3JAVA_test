package edu.handong.csee.java.hw3.exceptions;

public class MyNumberFormatException extends NumberFormatException {
    public MyNumberFormatException(String message) {
        super(message);
    }
    
    public String getMessage() {
        return super.getMessage();
    }
}
