package com.xiaoma.kotlin.day10

/**
 * kotlin的访问修饰符：public private protected internal
 * 其中internal表示模块权限
 */
fun main(args: Array<String>) {
    StringUtils.isEmpty("xiaoma")
}

/**
 * kotlin中是没有静态方法的，怎么办？
 * 1. 使用注解@JvmStatic
 * 2. 使用伴生对象：即 companion object
 *      伴生对象一定要写在一个类的内部，作为这个类的伴生对象存在
 */
class StringUtils {
    companion object {
        fun isEmpty(str: String): Boolean {
            return str == ""
        }
    }
}

/**
 * 单例1：通过object关键字，写一个匿名内部类
 * 比较推荐的单例写法：通过伴生对象写
 */
class Single private constructor() {

    companion object {
        fun get(): Single {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = Single()
    }
}