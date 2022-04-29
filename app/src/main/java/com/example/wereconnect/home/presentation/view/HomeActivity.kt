package com.example.wereconnect.home.presentation.view

import android.os.Bundle
import com.example.wereconnect.home.presentation.viewModel.SearchMoviesViewModel
import com.example.wereconnect.R
import com.example.wereconnect.infraestructure.di.BaseActivity
import com.example.wereconnect.infraestructure.extensions.retrieveViewModel


class HomeActivity : BaseActivity() {

    lateinit var viewModel: SearchMoviesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_were_connect)
        viewModel = retrieveViewModel()
        viewModel.setup()
    }
}