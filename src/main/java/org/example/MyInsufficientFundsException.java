package org.example;

public class MyInsufficientFundsException extends InsufficientFundsException{
    public MyInsufficientFundsException(java.lang.String message, int num) {
        super(message, num);
    }
}
