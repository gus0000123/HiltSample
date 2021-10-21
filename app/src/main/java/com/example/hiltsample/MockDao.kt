package com.example.hiltsample

import android.util.Log

interface MockDao {
    fun calledMockDao(item: String): Any
}

class MockDaoImpl : MockDao {
    private var TAG = javaClass.simpleName
    override fun calledMockDao(item: String): Any {
        Log.d(TAG, "calledMockDao ${item}")
        return Any()
    }
}