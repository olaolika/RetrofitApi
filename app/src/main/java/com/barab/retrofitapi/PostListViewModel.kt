package com.barab.retrofitapi

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.barab.retrofitapi.model.PostData
import com.barab.retrofitapi.model.PostRepository
import kotlinx.coroutines.launch

class PostListViewModel(application: Application) : AndroidViewModel(application){

    private var repository = PostRepository(application)

    private val posts = MutableLiveData<List<PostData>>()

    fun getAll(): MutableLiveData<List<PostData>> {
        viewModelScope.launch {
            repository.initPosts()
            posts.value = repository.list
        }
        return posts
    }


}