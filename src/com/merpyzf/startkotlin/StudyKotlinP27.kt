package com.merpyzf.startkotlin

/**
 * Created by 春水碧于天 on 2017/5/21.
 */

fun main(args: Array<String>) {

    var a: Int = 100

    println(a === a)

    //在java平台数字是物理存储为JVM原生类型,当我们需要一个可为空的引用(Int?)或泛型就会自动把数字装箱
    var boxedA: Int? = a
    var anotherBoxedA: Int? = a

    println(boxedA == anotherBoxedA) //比较数字是否相等

    println(boxedA === anotherBoxedA) //比较装箱后的数字对象是否相等，注：测试跟文档上的结果不符

    /*=========================================显示转换============================================*/


    //Kotlin不支持隐式转换,较小的类型不能隐式的转换成较大的类型,因此只能通过显示类型转换来拓宽数字
    /*var num1: Int=10
    var num2: Long = num1*/


    var num1: Int= 10
    var num2: Long = num1.toLong()

    print(num1.toLong() == num2) //两种不同的类型不能直接进行比较，此时的数字没有自动进行装箱

    var name: Char = 'a'

//if(name == 12) 注意在Kotlin中字符不是数字,使用的时候需要显示把字符类型转换为数字
// 当需要可以为空的引用时，像数字、字符会被自动装箱，不会保留同一性





}




