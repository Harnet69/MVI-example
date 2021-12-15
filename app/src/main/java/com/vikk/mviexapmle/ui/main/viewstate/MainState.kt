package com.vikk.mviexapmle.ui.main.viewstate

import com.vikk.mviexapmle.data.model.User
/*
    defining the states Idle, loading, users, error.
    Each state can be loaded on to the view by the user intents
 */
sealed class MainState{
    object Idle : MainState()
    object Loading : MainState()
    data class Users(val user: List<User>) : MainState()
    data class Error(val error: String?) : MainState()
}
