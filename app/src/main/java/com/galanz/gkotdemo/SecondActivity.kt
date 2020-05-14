package com.galanz.gkotdemo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        bt_1.setOnClickListener { finish() }
        bt_2.setOnClickListener { ActivityCollector.finishAll() }
    }

//    直接调用必须声明
    companion object{
        fun actionStart(context: Context,data1: String,data2: String){
            val intent = Intent(context,SecondActivity::class.java).apply {
                putExtra("param1",data1)
                putExtra("param2",data2)
            }
            context.startActivity(intent)
        }
    }
}
