package com.galanz.gkotdemo.test

import android.content.Context
import com.galanz.gkotdemo.SecondActivity
import com.galanz.gkotdemo.util.doAction
import java.lang.StringBuilder

/**
 *   Created by chenmy on 2020/4/30.
 *   常用参数技巧
 */

fun main() {
    //eg:1
    getThread()

    //eg:2
    prinUpperCase()

    //eg:3
    doStudy2(Study2())
    doStudy2(null)

    //eg:4
    printParams(123, "222")
    printParams(123)
    printParams2()
    printParams2(str = "eee")
    //eg:5
    printWith()
    printRun()
    printApply()

    //静态的一种
    doAction()
}

fun printApply() {
    //eg:
//    SecondActivity.actionStart()
}

fun printRun() {
    val list = listOf("aaa","bbb","ccc","ddd")
    val run = StringBuilder().run {
        append("eg:5 2 start eating \n")
        for (s in list) {
            append(s).append("\n")
        }
        append("ate all")
        toString()
    }
    println(run)
}

fun printWith() {
    val list = listOf("aaa","bbb","ccc","ddd")
    val result = with(StringBuilder()){
        append("eg:5 1 start eating \n")

        for (s in list) {
            append(s).append("\n")
        }
        append("ate all")
        toString()
    }
    println(result)
}

fun printParams2(num: Int = 100,str: String = "hello") {
    println("eg:4 2 num is $num , str is $str ")
}

//设置参数技巧只对第一个参数有用
fun printParams(num: Int,str: String = "hello") {
    println("eg:4 num is $num , str is $str ")
}

//let 讲方法放在一起调用
fun doStudy2(study2: Study2?) {
    println("eg:3 ")
    study2?.let {
        it.doHomework()
        it.readBooks()
    }
}

class Study2 : Study {
    init {
        print("Study2 ")
    }

    override fun readBooks() {
        println("readBooks")
    }
}

var content: String? = "eee"
private fun prinUpperCase() {
    println("eg:2 ${content?.toUpperCase()}")

}

private fun getThread() {
//    Thread(Runnable {
//        println("thread is running")
//    }).start()
    Thread {
        println("eg:1 thread is running")
    }.start()
}