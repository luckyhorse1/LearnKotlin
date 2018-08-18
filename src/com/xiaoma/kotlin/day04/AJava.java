package com.xiaoma.kotlin.day04;

public class AJava implements AInterface {

    public static final AJava a = new AJava();

    public static String format(String str) {
        return str.isEmpty() ? null : str;
    }

    @Override
    public void putNumber(int num) {
        System.out.println("int");
    }

    @Override
    public void putNumber(Integer num) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        Message.sayMessage("xiaoma");
    }

}
