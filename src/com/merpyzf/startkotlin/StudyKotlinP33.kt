package com.merpyzf.startkotlin

import java.lang.Integer.parseInt

/**
 * Created by wangke on 17-5-21.
 */

fun main(args: Array<String>) {

    /*=========================================控制流============================================*/

    //if的传统用法

    var max: Int;
    var a = 3
    var b = 4

    if (a > b)
        max = a
    else
        max = b

    //if作为表达式
    var max1 = if (a > b) a else b


    //if作为表达式的时候,if的分支可以是代码块,最后一个表达式作为该块的值

    var max2 = if (a > b) {

        print("测试if代码块中的内容")
        a

    } else {

        print("测试else代码块中的内容")
        b
    }

    print("max2的值$max2")


    /**
     *
     * when表达式
     *
     */


    //when取代了类C,java中的switch操作符

    var x = when (1) {

        1 -> {

            println("这是一个1")

            1

        }
    //如果有很多分支需要用相同的方式处理，则可以把多个分支条件放在一起
        2, 3 -> print("这是一个2")

    //我们可以用任意表达式(而不只是常量)作为分支条件
        1 + 1 -> print("这也是一个2")

        else -> {

            print("都没有")

        }


    }

    print(x);

    when (x) {

        in 1..10 -> print("在1-10这个区间中")

        !in 1..10 -> print("不在1-10这个区间中")

    }


    //用来检测一个值是或者不是一个特定类型的值,
    var isBoolean = when (x) {

        is String -> {
            //由于智能转换，可以直接访问该类型的方法和属性无需进行任何额外的检测
            x.startsWith("hi")
            true
        }

        else -> false


    }


    /**
     *
     * For循环
     *
     *
     */


    /*

    for循环可以对任何提供迭代器(iterator)的对象进行遍历

    -- 一个有成员函数或者扩展函数iterator(),它的返回类型
    -- 有一个成员函数或者扩展函数 next()并且有一个成员函数或者扩展函数 hasNext()返回Boolean

    for(item in collection){

        println(item)

    }*/

    //对于数组的for循环会被编译为并不创建迭代器基于索引的循环

    var mList = arrayOf("xiaoming", "xiaoma", "haha")

    //通过一个索引遍历一个数组或者List

    for(i in mList.indices){

        println(mList[i])

    }


    //库函数 withIndex

    for((index,value) in mList.withIndex()){

        // index表示下标
        // value表示值

        println("index=>$index value=>$value")

    }

    /**
     *
     * While循环
     * 与Java使用一样
     */


    /**
     * 返回和跳转
     *
     *  ---return 默认从最直接包围它的函数或者匿名函数返回
     *  ---break 终止直接包围它的循环
     *  ---continue 继续下一次直接包围它的循环
     *
     */

    /**
     *
     * 标签
     */


    loop@ for(i in 1..100){




    }

    loop@ for(j in 1..100){

        println("j==>$j")
        for(t in 1..100){

            print("t==>$t")
            if(t==2) break@loop  //break loop@标签后的语句，j只执行到1


        }

    }






}


