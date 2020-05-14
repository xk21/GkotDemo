package com.galanz.gkotdemo.demo.newfragment

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galanz.gkotdemo.R
import kotlinx.android.synthetic.main.activity_new_fragment.*

class NewContentActivity : AppCompatActivity() {

    companion object {
        fun actionStart(context: Context, title: String, content: String) {
            val intent = Intent(context, NewContentActivity::class.java).apply {
                putExtra("news_title", title);
                putExtra("news_content", content)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_content)
        val title = intent.getStringExtra("news_title")
        val context = intent.getStringExtra("news_content")
        if (title!=null&&context!=null){
            val fragment = newsContentFrag as NewsContentFragment
            fragment.refresh(title,context)
        }
    }


}
