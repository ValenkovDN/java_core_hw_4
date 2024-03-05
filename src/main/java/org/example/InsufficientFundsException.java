package org.example;

public class InsufficientFundsException extends Exception{
    private int num;

    public int getNum() {
        return num;
    }

    public InsufficientFundsException(java.lang.String message, int num) {
        super(message);
        this.num = num;
    }
}
