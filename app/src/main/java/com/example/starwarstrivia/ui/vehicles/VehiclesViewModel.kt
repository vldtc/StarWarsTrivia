package com.example.starwarstrivia.ui.vehicles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VehiclesViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Vehicles Fragment"
    }
    val text: LiveData<String> = _text
}