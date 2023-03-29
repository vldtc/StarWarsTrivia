package com.example.starwarstrivia.ui.planets

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlanetsViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Planets Fragment"
    }
    val text: LiveData<String> = _text
}