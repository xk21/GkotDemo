package com.galanz.gkotdemo.bean

/**
 *   Created by chenmy on 2020/5/13.
 */
class Msg(val content: String, val type: Int) {
    companion object {
        const val TYPE_RECEIVED = 0;
        const val TYPE_SENT = 1;
    }
}