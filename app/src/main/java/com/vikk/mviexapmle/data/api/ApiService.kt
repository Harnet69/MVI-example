package com.vikk.mviexapmle.data.api

import com.vikk.mviexapmle.data.model.User
import retrofit2.http.GET

interface ApiService {

    // specify HTTP methods to communicate to the API
    @GET("users")
    suspend fun getUsers(): List<User>
}