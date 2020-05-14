package com.galanz.gkotdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.galanz.gkotdemo.adapter.FruitAdapter
import com.galanz.gkotdemo.bean.Fruit
import kotlinx.android.synthetic.main.activity_fruit.*
import java.util.*
import kotlin.collections.ArrayList

class FruitActivity : BaseActivity() {
    private val fruitList = ArrayList<Fruit>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit)
        initFruitList()
        val staggeredGridLayoutManager =
            StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = staggeredGridLayoutManager
        val fruitAdapter = FruitAdapter(fruitList)
        recyclerView.adapter = fruitAdapter


    }

    private fun initFruitList() {
        //设置重复执行
        repeat(2){
            fruitList.run {
                add(Fruit(getRandomLengthName("Apple"), R.drawable.apple_pic))
                add(Fruit(getRandomLengthName("Banana"), R.drawable.banana_pic))
                add(Fruit(getRandomLengthName("Orange"), R.drawable.orange_pic))
                add(Fruit(getRandomLengthName("Watermelon"), R.drawable.watermelon_pic))
                add(Fruit(getRandomLengthName("Pear"), R.drawable.pear_pic))
                add(Fruit(getRandomLengthName("Grape"), R.drawable.grape_pic))
                add(Fruit(getRandomLengthName("Pineapple"), R.drawable.pineapple_pic))
                add(Fruit(getRandomLengthName("Strawberry"), R.drawable.strawberry_pic))
                add(Fruit(getRandomLengthName("Cherry"), R.drawable.cherry_pic))
                add(Fruit(getRandomLengthName("Mango"), R.drawable.mango_pic))
            }
        }
    }

    private fun getRandomLengthName(name: String): String {
        val length = Random().nextInt(20) + 1
        val builder = StringBuilder()
        for (i in 0 until length) {
            builder.append(name)
        }
        return builder.toString()
    }
}
