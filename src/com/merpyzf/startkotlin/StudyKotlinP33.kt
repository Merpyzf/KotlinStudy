package com.merpyzf.startkotlin

/**
 * Created by wangke on 17-5-21.
 */

fun main(args:Array<String>){

    /*=========================================控制流============================================*/

    //if的传统用法

    var max: Int;
    var a = 3
    var b = 4

    if(a>b)
        max = a
    else
        max = b

    //if作为表达式
    var max1 = if(a>b) a else b


    //if作为表达式的时候,if的分支可以是代码块,最后一个表达式作为该块的值

    var max2 = if(a>b){

        print("测试if代码块中的内容")
        a

    }else{

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


}


