@file:Suppress("DEPRECATION")

package com.test.news.tests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.test.news.R
import com.test.news.features.login.presentation.LoginActivity
import com.test.news.pages.LoginScreen
import com.test.news.utils.E2ETest
import com.test.news.utils.SmokeTest

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class UserLoginSucceeded : BaseTest() {

    @Test
    @SmokeTest
    @E2ETest
    fun successfulLogin() {

        //creates instance of LoginScreen() class from which to reference user userSuccessfullyLogsIn() method
        val loginscreen = LoginScreen()
        loginscreen.userSuccessfullyLogsIn(USER_NAME, USER_PASSWORD)
    }

    companion object {
        private const val USER_NAME = "user"
        private const val USER_PASSWORD = "password"
    }
}