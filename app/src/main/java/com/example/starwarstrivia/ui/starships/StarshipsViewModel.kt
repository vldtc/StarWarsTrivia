package com.example.starwarstrivia.ui.starships

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StarshipsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Starships Fragment"
    }
    val text: LiveData<String> = _text
}