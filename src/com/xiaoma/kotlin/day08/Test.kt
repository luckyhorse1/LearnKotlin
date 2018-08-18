package com.xiaoma.kotlin.day08


/**
 * kotlin的lambda是一个匿名对象
 * 可以使用inline修饰方法，这样当方法在编译时，就会拆解方法的调用为语句调用，进而减少创建不必要的对象
 */
fun main(args: Array<String>) {

}

/**
 * 不加inline的效果是：public static final void test(boolean isDebug, Function0<Unit> blok){
if (isDebug){
blok.invoke();
}
}
 *
 * 加了inline的效果：if (isDebug){
invoke();
}
 *
 * 但是，过度使用inline，会导致编译器的编译负担加重，而且会使代码块变得很庞大，查找问题很麻烦
 *
 * 所以，inline我们只用来修饰高阶函数，而不要滥用他
 */
fun test(isDebug: Boolean, block: () -> Unit) {
    if (isDebug) block()
}