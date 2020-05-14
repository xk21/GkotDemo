package com.galanz.gkotdemo.test

import java.util.*
import kotlin.collections.ArrayList

/**
 *   Created by chenmy on 2020/4/20.
 *   集合方法使用
 */
fun main() {
    //eg:1
    val cellphone1 = Cellphone("aa", 1222.1)
    val cellphone2 = Cellphone("aa", 1222.1)
    println("eg:1 "+cellphone1)
    println("eg:1 2 cellphone1 equals cellphone2 is ${cellphone1 == cellphone2}")

    Singleton.singletonTest()

    //eg:2
    listEg1()
    listEg2()

    //eg:3
    print("eg:3 ")
    mutableList1()

    //eg:4
    setList1()

    //eg:5
    mapList1()
    mapList2()

    //eg:6
    getListLength()

    //eg:7
    getUpperCase1()

    //eg:8
    getFilter1()

    //eg:9
    getAnyAndAll()
}

fun getAnyAndAll() {
    print("eg:9 ")
    val listOf = listOf("apple", "banana", "orange", "grape","aa","bbb")
    val any = listOf.any { it.length < 5 }
    val all = listOf.all { it.length <= 5 }
    println("anyResult is $any, allResult is $all .")
}

//过滤小于5的字符串并且转换大写
fun getFilter1() {
    print("eg:8 ")
    val listOf = listOf("apple", "banana", "orange", "grape","aa","bbb")
//    val filter = listOf.filter { it.length <= 5 }.map { it.toUpperCase() }
    val filter = listOf.filter { it.length <= 5 }.map { it.toUpperCase(Locale.ROOT) }
    for (s in filter) {
        print(s+" ")
    }
    println()
}

fun getUpperCase1(){
    print("eg:7 ")
    val list = listOf<String>("apple","banana","orange","grape")
    val map = list.map { it.toUpperCase() }
    for (s in map){
        print("name is $s, ")
    }
    println()
}

//最长的单词
fun getListLength() {
    val list = listOf<String>("apple","banana","orange","grape")
    val maxBy = list.maxBy { it.length }
    println("eg:6 max length fruit is $maxBy")
}

fun mapList2(){
    print("eg:5 2 ")
    val mapOf = mutableMapOf("apple" to 1, "banana" to 2, "orange" to 3, "grape" to 4)
    mapOf["aaa"] = 5;
    for (entry in mapOf) {
        print("name is ${entry.key}, number is ${entry.value}. ")
    }
    println()
}

fun mapList1(){
    print("eg:5 ")
    val mapOf = mapOf("apple" to 1, "banana" to 2, "orange" to 3, "grape" to 4)
    for (entry in mapOf) {
        print("name is ${entry.key}, number is ${entry.value}. ")
    }
    println()
}

fun setList1(){
    val setlist = setOf("apple", "banana", "orange", "grape")
    print("eg:4 ")
    for (s in setlist) {
        print(s+" ")
    }
    println()
}

fun mutableList1(){
    val mutableListOf = mutableListOf("apple", "banana", "orange", "grape")
    mutableListOf.add("aaa")
    for (s in mutableListOf) {
        print(s+" ")
    }
    println()
}

fun listEg2() {
    //不可变集合
    val list = listOf<String>("apple","banana","orange","grape")
}

fun listEg1() {
    val list = ArrayList<String>()
    list.add("apple")
    list.add("banana")
    list.add("orange")
    list.add("grape")
}

