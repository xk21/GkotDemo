package com.galanz.gkotdemo.test

/**
 *   Created by chenmy on 2020/4/20.
 *   对象的使用
 *
 */
fun main() {
//    val p = Person()
//    p.name = "Jack"
//    p.age = 19
//    p.eat()
//
//    val s = Student("12",4)
//    s.name = "aa"
//    s.age = 99

//    val s = Student("22",11)
//    val s2 = Student("22",11,22,"AK")


    val s = Student1("SSS", 20)
    s.readBooks()
    s.doHomework()
}


class Student1(name: String, age: Int) : PerSon1(name, age),
    Study {
    override fun readBooks() {
        println(name + " is reading")
    }

//    override fun doHomework() {
//
//    }

}

//internal private public protected

//添加接口 及 默认实现接口方法


//class Student : Person() {
//    var sno = ""
//    var grade = 0
//}

//相当于没有主构造函数
class Student : Person {
    constructor() : super()
}

//class Student(val sno: String,val grade: Int) : Person(){
//    init {
//        println("son is $sno, grade is $grade")
//    }
//}

//次构造函数
//class Student(val sno: String,val grade: Int,age: Int,name: String) : Person(name,age){
//class Student(val sno: String,val grade: Int,age: Int,name: String) : Person(){
//    init {
//        println("son is $sno, grade is $grade ,name is $name ")
//    }
//
//    constructor(sno: String,grade: Int): this(sno,grade,0,"")
//    constructor(): this("",0)
//}


//open class Person(val name: String,val age: Int)

//添加open关键字类可以被继承
open class Person() {
    var name = ""
    var age = 0
    fun eat() {
        println(name + " is eating. He is " + age + " years old.")
    }
}
