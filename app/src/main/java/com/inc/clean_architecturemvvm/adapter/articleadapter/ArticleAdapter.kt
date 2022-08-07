package com.inc.clean_architecturemvvm.adapter.articleadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.inc.clean_architecturemvvm.R
import com.inc.clean_architecturemvvm.data.model.article.ArticleItem
import com.inc.clean_architecturemvvm.databinding.ArticleItemViewBinding


class ArticleAdapter(repositoryList: ArrayList<ArticleItem>, val onClick: (Any) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var articleList: ArrayList<ArticleItem> = arrayListOf()

    init {
        this.articleList = repositoryList
    }


    fun updateRepositoriesList(articleList: ArrayList<ArticleItem>) {
        this.articleList = articleList
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {


        val binding: ArticleItemViewBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.article_item_view, parent, false
        )

        return RepositoriesViewHolder(binding)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (articleList.isNotEmpty())
            (holder as RepositoriesViewHolder).bind(articleList[position])
    }

    override fun getItemCount(): Int {
        return articleList.size
    }

    inner class RepositoriesViewHolder(val binding: ArticleItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(articleItem: ArticleItem) {

            binding.item = articleItem
            binding.executePendingBindings()

           binding.cardLayout.setOnClickListener {
                onClick.invoke(articleItem)
            }

        }


    }

}