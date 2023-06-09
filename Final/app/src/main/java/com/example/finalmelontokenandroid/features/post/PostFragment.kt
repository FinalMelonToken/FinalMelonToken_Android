package com.example.finalmelontokenandroid.features.post

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finalmelontokenandroid.base.BaseFragment
import com.example.finalmelontokenandroid.databinding.FragmentPostBinding
import com.example.finalmelontokenandroid.model.Post

class PostFragment : BaseFragment<FragmentPostBinding, PostViewModel>() {
    override val viewModel: PostViewModel by viewModels()
    override fun observerViewModel() {
        initRecyclerView()

    }

    private fun initRecyclerView() {
        val list = listOf(
            Post("상민컷 만들었어용", "그래", "1일 전"),
            Post("상민컷 만들었어용", "그래", "1일 전"),
            Post("상민컷 만들었어용", "그래", "1일 전"),
            Post("상민컷 만들었어용", "그래", "1일 전"),
            Post("상민컷 만들었어용", "그래", "1일 전"),
        )
        mBinding.rvPost.adapter = PostAdapter(list)
        mBinding.rvPost.layoutManager = LinearLayoutManager(activity)
    }
}