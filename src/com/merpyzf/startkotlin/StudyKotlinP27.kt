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

    /*=========================================数组============================================*/

    /**
     * Kotlin中的数组是不型变的(invariant),这意味着Kotlin不让我们把Array<String>赋值给Array<Any>
     *
     * Kotlin中也有无装箱开销的专门的类用来表示原声类型的数组：ByteArray,ShortArray,IntArray……需要注意的是,这些类和Array没有继承
     * 关系,但他们有同样的属性和方法
     *
     */


    //使用库函数arrayof()来创建一个数组
     var arrays = arrayOf(1,2,3)

    for (array in arrays) {

        println("数组中的值=>$array")

    }

    //使用arrayOfNulls()创建一个指定大小元素都为空的数组
    var arrays1 = arrayOfNulls<Unit>(10)

    var count = 0


    for(item in arrays1){

        count++
    }

    println("arrays1数组的长度=>"+count)


    var asc: Array<String>? = null //? val于var的区别

    for(i in 1..10){

        asc = Array(10,{i -> (i*i).toString()})

    }

    var s = asc?.get(9)
    println("s的值->"+s)






}




