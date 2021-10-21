package com.example.hiltsample

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private var dao: MockDao) : ViewModel() {
    fun doSomething() {
        Log.d("MainViewmodel", "doSomething")
        dao.calledMockDao("doSomething")
    }
}