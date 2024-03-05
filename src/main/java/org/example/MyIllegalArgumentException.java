package org.example;

public class MyIllegalArgumentException extends IllegalArgumentException{
    public MyIllegalArgumentException(java.lang.String message, int num) {
        super(message, num);
    }
}
