package com.limitalltheir.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.limitalltheir.newsapp.ui.NewsActivity
import com.limitalltheir.newsapp.ui.NewsViewModel
import com.limitalltheir.newsapp.ui.adapters.NewsAdapter

open class BaseFragment(@LayoutRes layout: Int) : Fragment(layout) {

    lateinit var viewModel: NewsViewModel
    lateinit var newsAdapter: NewsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}