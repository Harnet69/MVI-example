package com.vikk.mviexapmle.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vikk.mviexapmle.data.api.ApiHelper
import com.vikk.mviexapmle.data.repository.MainRepository
import com.vikk.mviexapmle.ui.main.viewModel.MainViewModel


/*
    instantiating our viewModel in this class and we will return the instance of the ViewModel
 */
class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory  {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}