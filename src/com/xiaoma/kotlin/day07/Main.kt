package com.xiaoma.kotlin.day07

fun main(args: Array<String>) {
    /**
     * kotlin的lambda语法：
     * 没有入参可以不写箭头
     */
    Thread({ print("xiaoma") })
    //lambda是函数的最后一个参数，则可以写在外面。
    Thread { print("haha") }
    //如果函数只有一个参数，并且该参数就是一个lambda，则可以不写小括号
    Thread { print("hello") }

    //lambda闭包的执行类似于函数
    echo("xiaoma", 1)
    echo.invoke("xiaoma", 1)

    //自己写了一个扩展的23个参数的lambda闭包
    lambdaA(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)

}

/**
 * lambda闭包声明,参数的个数最多为22,这是因为库文件Functions.kt里只定义了从0开始到22个参数的接口。
 * 本质上，lambda还是要编译成匿名内部类的对象。
 *  Function1(String, Int, Unit) echo = (Function1) echo.INSTANCE;
 */
val echo = { name: String, a: Int -> println(name) }

val lambdaA = { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int,
                q: Int, r: Int, s: Int, t: Int, u: Int, v: Int, w: Int ->
    print("xiaoma, nihao")
}


