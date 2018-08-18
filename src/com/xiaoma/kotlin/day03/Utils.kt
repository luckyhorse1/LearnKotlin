package com.xiaoma.kotlin.day03

import kotlin.reflect.KClass

fun echo(name: String) {
    println("$name")
}

/**
 * kotlin中匿名内部类的写法，也是单例对象的写法
 * object关键字 相当于定义了一个单例对象
 */
object Message {
    val i: Int = 1
    fun sayMessage(msg: String) {
        println(msg)
    }
}

fun main(args: Array<String>) {
    //在kotlin中调用该单例对象的语法
    Message.sayMessage("xiaoma")

    //kotlin中  java和kotlin的  .class的  语法
    testJavaClass(JavaMain::class.java)
    testKotlinClass(KotlinMain::class)

    //java变量与kotlin关键字发生冲突，用反引号进行转义
    println(JavaMain.`in`)
}


fun testJavaClass(clazz: Class<JavaMain>) {
    println(clazz.simpleName)
}

fun testKotlinClass(clazz: KClass<KotlinMain>) {
    println(clazz.simpleName)
}