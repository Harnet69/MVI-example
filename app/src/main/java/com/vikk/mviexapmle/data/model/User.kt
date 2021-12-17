package com.vikk.mviexapmle.data.model

import com.squareup.moshi.Json

// model to which the response will be transformed
data class User(
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "name")
    val name: String = "",
    @Json(name = "email")
    val email: String = "",
    @Json(name = "avatar")
    val avatar: String = "",
    val isLogged: Boolean = false
)
