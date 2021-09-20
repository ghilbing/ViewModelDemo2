package com.anushka.viewmodeldemo2

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int): ViewModel() {
    private var total = MutableLiveData<Int>()
    //this is to allow MutableLiveData be accessed from MainActivity
    val totalData : LiveData<Int>
        get() = total

    @Bindable
    val inputText = MutableLiveData<String>()

    init {
        total.value = startingTotal
    }

    fun setTotal() {
        val intInput : Int = inputText.value!!.toInt()
        total.value = (total.value)?.plus(intInput)
    }
}