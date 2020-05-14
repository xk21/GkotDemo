package com.galanz.gkotdemo.demo.newfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galanz.gkotdemo.BaseActivity
import com.galanz.gkotdemo.R

class NewFragmentActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_fragment)
    }
}
