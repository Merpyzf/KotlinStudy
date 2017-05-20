package com.merpyzf.studykotlin

import org.omg.CORBA.Object

/**
 * Created by wangke on 17-5-20.
 *
 * 使用is进行类型的判断
 */

fun main(args:Array<String>){

    println(getStringLength(1))

}



fun getStringLength(obj:Any): Int?{

    if(obj is String){

        return obj.length;

    }else{

        print("你输入的变量不是String类型")

    }

    return null
}

fun getStringLength1(obj: Any):Int?{

    if(obj !is String) return null

    return obj.length


}



