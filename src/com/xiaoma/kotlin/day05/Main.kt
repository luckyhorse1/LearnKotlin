package com.xiaoma.kotlin.day05


fun main(args: Array<String>) {
    function()
}

/**
 * 函数特性：参数可以有默认值
 */
fun echo(str: String = "xiaoma") {
    print(str)
}

/**
 * 函数特性：只有一条语句，可以直接赋值
 */
fun echo2(str: String) = print("$str")

/**
 * 内部函数（函数的嵌套）：用于递归，或者 不希望外部函数调用 的情况。一般情况不使用，因为会让代码的可读性变低
 */
fun function() {
    val str = "xiaoma"

    fun say(count: Int = 10) {
        println(str)
        if (count > 0) {
            say(count - 1)
        }
    }

    say()
}