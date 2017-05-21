package com.merpyzf.studykotlin

import java.lang.Integer.parseInt

/**
 * Created by wangke on 17-5-20.
 */

fun main(args: Array<String>) {

    println(max(1, 2))
    println(max1(1, 2))
    println(testRetrunNull(null))

    println(tranForm("blu"))

}

//创建一个函数 fun关键字 函数名 (型参:类型……): 返回值类型
fun max(a: Int, b: Int): Int {

    //if语句的使用和java中一样
    if (a > b) {

        return a;

    } else {

        return b;
    }
}

//单表达式函数
fun max1(a: Int, b: Int) = if (a > b) a else b


//当某个变量的值为null,必须在声明处的类型后面加？
fun testRetrunNull(a: Int?): Int? {


    return a;
}


fun tranForm(color :String):Int = when(color){

    "red" -> 0
    "blue"-> 1
    else -> throw IllegalArgumentException("找不到你要的颜色")


}




