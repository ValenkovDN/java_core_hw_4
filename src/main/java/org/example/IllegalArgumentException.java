package org.example;

public class IllegalArgumentException extends Exception{
    private int num;

    public int getNum() {
        return num;
    }

    public IllegalArgumentException(java.lang.String message, int num) {
        super(message);
        this.num = num;
    }
}
