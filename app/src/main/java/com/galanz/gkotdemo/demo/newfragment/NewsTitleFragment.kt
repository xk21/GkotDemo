package com.galanz.gkotdemo.demo.newfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.galanz.gkotdemo.R
import kotlinx.android.synthetic.main.activity_new_content.*
import kotlinx.android.synthetic.main.news_title_frag.*
import java.lang.StringBuilder
import java.util.*
import kotlin.collections.ArrayList

/**
 *   Created by chenmy on 2020/5/14.
 */
class NewsTitleFragment: Fragment() {

    private var isTwoPane = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.news_title_frag, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        isTwoPane = activity?.findViewById<View>(R.id.newsContentLayout) != null
        val layoutManager = LinearLayoutManager(activity)
        newsTitleRecyclerView.layoutManager = layoutManager
        val adapter = NewsAdapter(getNews())
        newsTitleRecyclerView.adapter = adapter
    }

    private fun getNews(): ArrayList<News> {
        val newsList = ArrayList<News>()
        for (i in 1..50) {//[0,50]双闭环
            val news = News("This is news title $i", getRandomLengthString("This is news content $i. "))
            newsList.add(news)
        }
        return newsList
    }

    private fun getRandomLengthString(str: String): String {
        val n = Random().nextInt(20) + 1
        val stringBuilder = StringBuilder()
        repeat(n){
            stringBuilder.append(str)
        }
        return stringBuilder.toString()
    }

   inner class NewsAdapter(private val newList: List<News>): RecyclerView.Adapter<NewsAdapter.ViewHolder>(){
      inner  class ViewHolder(view:View): RecyclerView.ViewHolder(view){
          val newsTitle:TextView = view.findViewById(R.id.newsTitle)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
            val viewHolder = ViewHolder(view)
            viewHolder.itemView.setOnClickListener {
                val news = newList[viewHolder.adapterPosition]
                if (isTwoPane){
                    val fragment = newsContentFrag as NewsContentFragment
                    fragment.refresh(news.title, news.content)
                }else{
                    NewContentActivity.actionStart(parent.context,news.title,news.content)
                }
            }

            return viewHolder
        }

        override fun getItemCount() = newList.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val news = newList[position]
            holder.newsTitle.text = news.title
        }
    }
}