package com.merpyzf.studykotlin

import jdk.nashorn.internal.parser.JSONParser
import java.io.*
import java.net.HttpURLConnection
import java.net.URL
import java.nio.charset.Charset

/**
 * Created by wangke on 17-5-20.
 * for循环的使用
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


    var file = File("/test.txt")

    file.setWritable(true)
    file.setReadable(true)
    file.setExecutable(true)

    var mIs = FileOutputStream(file,true)

    val bos = BufferedOutputStream(mIs)

    var str:String="10"

    val toByte: ByteArray = str.toByteArray(Charsets.UTF_8)

    bos.write(toByte)

    bos.flush()

    bos.close()


}




