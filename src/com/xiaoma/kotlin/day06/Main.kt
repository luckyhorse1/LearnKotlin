package com.xiaoma.kotlin.day06

import java.io.File

fun main(args: Array<String>) {
    /**
     * readText是File类的一个扩展函数，因为他并没有写在File的类里.
     * 作用：在你不能修改的类里面，添加一些你需要用到的函数
     * 结果：给一个类添加静态的函数或变量
     */
    val file = File("LearnKotlin.iml")
    print(file.readText())
}