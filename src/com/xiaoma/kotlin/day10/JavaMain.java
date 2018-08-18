package com.xiaoma.kotlin.day10;

public class JavaMain {

    public static void main(String[] args) {
        //java中调用伴生对象的方式。原因：伴生对象在编译后在类内部生成了一个静态对象Companion，
        StringUtils.Companion.isEmpty("");
    }
}
