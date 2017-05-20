package com.merpyzf.studykotlin

/**
 * Created by wangke on 17-5-20.
 * 无形中Kotlin的第一个HelloWorld
 * KtStudy01 函数的定义
 *
 */


fun main(args: Array<String>) {

    println("Hello,Word!")
    println(sum(1, 2))
    println(sum1(3, 4))
    println(printSum(5,6))
    println(printSum1(7,8))

}


/**
 * 使用Kotlin声明一个函数
 */
fun sum(a: Int, b: Int): Int {
    return a + b;
}

/**
 * 将表达式作为函数体，返回类型自动推断
 */
fun sum1(a: Int, b: Int) = a + b

/**
 * Unit函数返回无意义的值
 */
fun printSum(a: Int, b: Int): Unit {

    println("${a}和${b}的和为${a + b}")

}

fun printSum1(a: Int,b:Int){
    //Kotlin
    println("返回类型可以省略==>${a}和${b}的值为${a+b}");

}









