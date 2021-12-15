package com.vikk.mviexapmle.data.repository

import com.vikk.mviexapmle.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}