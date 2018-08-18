package com.xiaoma.kotlin.day06

fun main(args: Array<String>) {
    /**
     * kotlin的扩展函数，是静态的给一个类添加的，他没有一个运行时的多态效果。
     */
    Dog().printName(Dog())
}

open class Animal //open 与java里的final相反
class Dog : Animal()

//扩展函数的静态解析

//public static final String name(Animal receiver){
//    return "animal";
//}
fun Animal.name() = "animal"

//public static final String name(Dog receiver){
//    return "dog";
//}
fun Dog.name() = "dog"

//public static final void printName(Animal r, Animal a){// 第一个参数是要扩展的那个类的对象
//    String str = name(a);
//    System.out.println(str);
//}
fun Animal.printName(animal: Animal) = println(animal.name())