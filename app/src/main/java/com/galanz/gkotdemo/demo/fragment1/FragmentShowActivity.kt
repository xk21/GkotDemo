package com.galanz.gkotdemo.demo.fragment1

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.galanz.gkotdemo.BaseActivity
import com.galanz.gkotdemo.R
import kotlinx.android.synthetic.main.left_fragment.*

//演示fragment
class FragmentShowActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_show)
        button.setOnClickListener {
            replaceFragment(AnotherRightFragment())
        }
        replaceFragment(RightFragment())



    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val beginTransaction = fragmentManager.beginTransaction()
        beginTransaction.replace(R.id.rightFragment,fragment)
        //添加这个返回键需要多次才能退出当前activity
        //主要功能将事务添加到返回栈中
//        beginTransaction.addToBackStack("a")
        beginTransaction.commit()
    }
}
