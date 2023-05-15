package edu.handong.csee.java.hw3.exceptions;

public class InvalidCommandException extends Exception{
    public InvalidCommandException(String message) {
        super(message);
    }
    
    public String getMessage() {
        return super.getMessage();
    }
}
