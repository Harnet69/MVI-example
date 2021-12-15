package com.vikk.mviexapmle.data.api

import com.vikk.mviexapmle.data.model.User

// fetch the List<Users>
class ApiHelperImpl(private val apiService: ApiService): ApiHelper {
    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }

}