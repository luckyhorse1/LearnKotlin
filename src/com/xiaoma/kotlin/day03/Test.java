package com.xiaoma.kotlin.day03;

public class Test {

    public static void main(String[] args) {

        /**
         * java调用kotlin文件的函数
         * 本质上，kotlin文件最后也是要编译成class文件的。
         * 在kotlin文件中写的变量或者函数，最终都会编译成，类名为：文件名KT 的类的 public static 变量或函数
         */
        UtilsKt.echo("xiaoma");

        /**
         * java代码调用 kotlin文件中 的 object关键字定义的单例对象 的语法
         * 匿名内部类会被编译成 类Message，然后他的构造函数被设为私有，他的内部有一个单例对象INSTANCE
         */
        Message.INSTANCE.sayMessage("xiaoma");
    }
}
