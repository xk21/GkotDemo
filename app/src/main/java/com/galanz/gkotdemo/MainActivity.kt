package com.galanz.gkotdemo

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.galanz.gkotdemo.demo.fragment1.FragmentShowActivity
import com.galanz.gkotdemo.demo.newfragment.NewFragmentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_1.setOnClickListener(this)
//            startActivity(Intent(this, SecondActivity::class.java))
//            startActivity(Intent("android.intent.action.ACTION_START"))
//            SecondActivity.actionStart(this, "11","22")

        bt_2.setOnClickListener(this)
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("https://www.baidu.com")
//            startActivity(intent)
        bt_3.setOnClickListener(this)
        bt_4.setOnClickListener(this)
        bt_5.setOnClickListener(this)
        bt_6.setOnClickListener(this)
        bt_7.setOnClickListener(this)
        bt_8.setOnClickListener(this)
        bt_9.setOnClickListener(this)
        bt_10.setOnClickListener(this)
        bt_11.setOnClickListener(this)
        bt_12.setOnClickListener(this)

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "is add", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "is remove", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onClick(v: View?) {
        when (v) {
            bt_2 -> {
                startActivity(Intent(this, FruitActivity::class.java))
            }
            bt_1 -> {
                SecondActivity.actionStart(this, "11", "22")
            }
            bt_3 -> {
                startActivity(Intent(this, MsgActivity::class.java))
            }
            bt_4 -> {
                startActivity(Intent(this, FragmentShowActivity::class.java))
            }
            bt_5 -> {
                startActivity(Intent(this, NewFragmentActivity::class.java))
            }
            bt_6 -> {
                startActivity(Intent(this, FragmentShowActivity::class.java))
            }
            bt_7 -> {

            }
            bt_8 -> {

            }
            bt_9 -> {

            }
            bt_10 -> {

            }
            bt_11 -> {

            }
            bt_12 -> {

            }
        }
    }
}
