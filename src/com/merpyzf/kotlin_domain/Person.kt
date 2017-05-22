package com.merpyzf.kotlin_domain

/**
 * Created by 春水碧于天 on 2017/5/22.
 */

//使用class关键字声明一个类
//在Kotlin中一个类可以有一个主构造函数和一个或多个次构造函数
class Person(name: String) {

    private var name:String = ""

    //初始化的代码可以放到init关键字作为前缀的初始化块
    //主构造的参数可以在init中使用，也可以在类体内声明的属性初始化器中使用
    init {

        this.name = name
        print("init方法执行了")
    }

    var UpName = name.toUpperCase()






}

//class Person 如果一个类没有类体，可以省略花括号