package com.example.starwarstrivia.ui.species

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SpeciesViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Species Fragment"
    }
    val text: LiveData<String> = _text

}