package com.merpyzf.startkotlin

/**
 * Created by wangke on 17-5-21.
 */
fun main (args:Array<String>){

/*=========================================字符串============================================*/
    /*
        字符串是不可变的
        字符串的元素可以使用索引获取
        可以使用for循环循环字符串

     */

    var str: String = "Hello,Kotlin!"

    println("str[0]=> "+str[0])

    for(s in str){

        print(s+" ")

    }



    var str1 = "Hello,Kotlin!\n" //转移字符

    var str2 = """

        for(int i = 0;i<10;i++){

            Log.i(“wk”,"i")
        }

    """                         //原生字符串

    print(str2)

    var i = 1

    //字符串模版
    var str3 = "str1=$i"

    var str4 = "str1 = ${i+1}" //可以在花括号内执行操作

    var price = """

    ${'$'}9.9

    """ //原生字符串和转义字符串内部都支持模板，在原生字符串中不支转义字符,在原生字符中使用“$”的方法








}



