package com.xiaoma.kotlin.day02


/**
 * var：变量    val：不可变的变量，并不是常量
 */
var age: Int = 18
val name: String = "xiaoma"

/**
 * 编译器可以直接推断一些类型
 */
var age2 = 18
var name2 = "xiaoma"

/**
 * kotlin是空安全的语言，String是非空的类型，String?是可以为空的类型，他们两个是不同的类型
 */
//var str: String = null  //这行代码是编译不过的
var str: String? = null //这行代码可以编译过
var str2: String = "xiaoma"

fun main(args: Array<String>) {

    printLen(str2)
    str = str2
    str2 = str!!//可以为空类型 赋值给 不可为空类型，必须强转
}

/**
 * 函数的语法
 */
fun printLen(str: String): String {
    println("这个字符串是:$str")
    return str
}