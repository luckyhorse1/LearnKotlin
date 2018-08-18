package com.xiaoma.kotlin.day04

import com.xiaoma.kotlin.day04.AJava.format

fun main(args: Array<String>) {

    //结果是：只调用了基本类型的那个函数
    AJava.a.putNumber(123)

    function("")
}

fun function(str: String) {
    val fmt1 = format(str)// 编译器推断的该类型为 String! , 这个类型我们是不能手动声明的，这个是编译器识别的一个兼容类型，他的使用和在java中一样
//    print(fmt1.length)//这里会报空指针异常，用法和java一样

//    val fmt2: String = format(str)//这里不能给fmt2 赋null值，会报错：java.lang.IllegalStateException: format(str) must not be null

    val fmt3: String? = format(str)
    print(fmt3?.length)//如果fmt3为空，则这里输出结果为：null，不会报空指针异常


}

object Message {

    /**
     * java调用该方法时需要使用：Message.INSTANCE.sayMessage(),
     * 加上注解JvmStatic，可以让该方法成为静态方法，
     * java调用的时候，可以使用：Message.sayMessage()
     */
    @JvmStatic
    fun sayMessage(msg: String) {
        println(msg)
    }
}