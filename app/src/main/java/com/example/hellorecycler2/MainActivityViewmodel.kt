package com.example.hellorecycler2

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.source.DataRepository

class MainActivityViewmodel : ViewModel() {

    val listData = MutableLiveData<List<String>>()

    init {
        listData.value = DataRepository.getList100()
        Log.e("---", "dataLoaded")
    }

}