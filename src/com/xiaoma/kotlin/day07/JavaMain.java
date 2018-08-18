package com.xiaoma.kotlin.day07;

public class JavaMain {

    public static void main(String[] args) {

        /**
         * java的lambda表达式的理解：匿名内部类的简单写法
         */
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        /**
         * 箭头前的小括号内表示的是入参，大括号内的部分表示的是执行语句。
         * 如果小括号只有一个参数，可以不写小括号。
         * 小括号的参数类型是可选的，编译器可以自动识别。
         * 如果大括号内只包含一条语句，那可以不写大括号。
         * 如果大括号包含多条语句，则需要显示的用return返回。
         */
        Thread t = new Thread(() -> {
            System.out.println("haha");
        });
        t.start();
    }

}
