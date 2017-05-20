package com.merpyzf.studykotlin

/**
 * Created by wangke on 17-5-20.
 * for循环的使用
 *
 */

fun main(args: Array<String>) {

    var lists = arrayListOf<String>("1", "2", "3", "4")

    for (item in lists) {

        println("循环遍历=>$item")

    }

    for (index in lists.indices){
        //遍历下标
        println("当前下标为${index}的值为${lists[index]}")

    }

    var index = 0

    while(index < lists.size){

        println("while遍历==>${index}==>${lists[index]}")

        index++
    }

    var x =10


    when(x){

        10 -> println("这是一个是10")
        20 -> println("这是一个是20")
        else -> print("其他的……")
    }


}



