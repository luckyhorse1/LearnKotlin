package com.xiaoma.kotlin.day09

/**
 * kotlin类
 * class MainActivity： AppCompatActivity(), OnClickListener
 *
 * kotlin的类默认是public final的
 */
fun main(args: Array<String>) {
    Test()
}

/**
 * kotlin构造函数有主次之分
 * 主构造函数写在类名后面，也可以不写，隐式存在。其中，默认参数值为val类型。主构造函数要执行地语句，在init代码块中写。
 * 次构造函数必须显示地写出来
 *
 * 次构造函数必须直接或间接地继承主构造函数或父类地构造函数
 */
class Test() {

    constructor(str: String, i: Int) : this() {
        print("haha")
    }

    init {
        println("haha")
    }
}