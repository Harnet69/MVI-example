package com.vikk.mviexapmle.data.api

import com.vikk.mviexapmle.data.model.User

interface ApiHelper {

    suspend fun getUsers(): List<User>
}