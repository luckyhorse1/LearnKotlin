package com.xiaoma.kotlin.day08

/**
 * 高阶函数：函数（lambda）的参数是函数（lambda）。
 * 没有返回值，默认返回一个Unit对象，可以显示的写出来，也可以不写
 * 这里的block，是一个没有入参，且没有返回值的lambda
 */
fun onlyif(isDebug: Boolean, block: () -> Unit) {
    if (isDebug) block()
}

fun main(args: Array<String>) {
//    onlyif(true){
//        print("xiaoma")
//    }

    /**
     * kotlin中函数是一等公民，不像java必须使用对象去调用
     * 可以让函数作为一个 引用 ，然后传递进函数里
     * 实际上高阶函数中，传递的是 函数的声明 ，如果传递的是 函数的执行 ，那传递的只不过是 返回值
     */
    val runnable = Runnable {
        println("Runnable:run")
    }
    val function: () -> Unit   //声明funtion的函数类型为 () -> Unit
    function = runnable::run

    onlyif(true, function)
}

