package com.example.jesuitasrioja.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Centro Sagrado Corazon Logroño"
    }
    val text: LiveData<String> = _text
}