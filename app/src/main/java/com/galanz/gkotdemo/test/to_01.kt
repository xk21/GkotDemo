package com.galanz.gkotdemo.test

import kotlin.math.max

/**
 *   Created by chenmy on 2020/4/18.
 *   关键字
 */

fun main() {
    //eg:1 val
    val a = 10
    println("eg:1 a = $a")

    //eg:2 var
    var b = 10
    b *= 10
    println("eg:2 b = " + b)

    //eg:3 if else
    val largerNumber = largerNumber(4, 7)
    println("eg:3 max = $largerNumber")

    println("eg:3 1 max = ${largerNumber1(9, 4)}")
    println("eg:3 2 max = ${largerNumber2(8, 4)}")
    println("eg:3 3 max = ${largerNumber3(6, 4)}")

    //eg:4 when
    println("eg:4 score = ${getScore("aa")}")
    println("eg:4 1 score = ${checNumeber(55)}")
    println("eg:4 2 score = ${checNumeber("da di")}")

    //eg:5 循环
    print("eg:5 ")
    for (i in 0..10){ //[0,10]双闭环
        print("$i ")
    }
    println()

    print("eg:5 1 ")
    //val = 0 until 10 [0,10)
    for (i in 0 until 10 step 2){
        print("$i ")
    }
    println()

    //val = 0 until 10 [0,10)
    print("eg:5 2 ")
    //val = 0 until 10 [0,10)
    for (i in 10 downTo 1){
        print("$i ")
    }
    println()


}

fun checNumeber(num: Any): String{
    return when(num){
        is Int -> "num is Int is $num"
        is String -> "num is String is $num"
        else -> "no match value"
    }
}

fun largerNumber(num1: Int, num2: Int): Int {
    return max(num1, num2)
}

fun largerNumber1(num1: Int, num2: Int): Int {
    var value = 0;
    if (num1 > num2) {
        value = num1
    } else {
        value = num2
    }
    return value
}

fun largerNumber2(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

fun largerNumber3(num1: Int, num2: Int) = if (num1 > num2) num1 else num2
fun getScore(name: String) = when (name) {
    "aa" -> 66
    "bb" -> 77
    "cc" -> 88
    "dd" -> 99
    else -> 0
}
