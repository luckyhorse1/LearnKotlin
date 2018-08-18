package com.xiaoma.kotlin.day06;

import kotlin.io.FilesKt;
import kotlin.text.Charsets;

import java.io.File;

public class JavaMain {

    public static void main(String[] args) {
        /**
         * JAVA代码中使用扩展函数
         */
        File file = new File("LearnKotlin.iml");
        String content = FilesKt.readText(file, Charsets.UTF_8);
        System.out.println(content);
    }


}

