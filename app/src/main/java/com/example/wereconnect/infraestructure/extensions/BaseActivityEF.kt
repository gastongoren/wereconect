package com.example.wereconnect.infraestructure.extensions

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.wereconnect.infraestructure.di.BaseActivity

inline fun <reified T : ViewModel> BaseActivity.retrieveViewModel(): T {
    return ViewModelProvider(this, viewModelFactory)[T::class.java]
}