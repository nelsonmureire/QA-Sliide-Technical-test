package com.test.news.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.test.news.features.login.presentation.LoginActivity
import com.test.news.pages.LoginScreen
import com.test.news.utils.SmokeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class UserLoginFailed : BaseTest() {

    @Test
    @SmokeTest
    fun failedLogin() {

        //creates object instance of class and references userFailsToLogin() method
        val loginscreen = LoginScreen()
        loginscreen.userFailsToLogin(USER_NAME, USER_PASSWORD)
    }

    companion object {
        private const val USER_NAME = "password"
        private const val USER_PASSWORD = "password"
    }

}