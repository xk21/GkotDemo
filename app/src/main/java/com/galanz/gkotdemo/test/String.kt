package com.galanz.gkotdemo.test
//扩展函数
fun String.lettersCount(): Int {
    var count = 0
    for (char in this) {
        if (char.isLetter()) {
            count++
        }

    }
    return count
}

//运算符重载加扩展函数
operator fun String.times(n: Int) = this.repeat(n)

fun String.ee():Int{
    return 1;
}