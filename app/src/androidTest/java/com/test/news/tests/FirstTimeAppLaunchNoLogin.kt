@file:Suppress("DEPRECATION")

package com.test.news.tests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.test.news.R
import com.test.news.features.login.presentation.LoginActivity
import com.test.news.pages.LoginScreen
import com.test.news.utils.SmokeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FirstTimeAppLaunchNoLogin : BaseTest() {

    @Test
    @SmokeTest
    fun verifyLoginScreenIsLoaded() {
        //creates loginscreen object instance from which to reference the firstTimeloginScreenVerification()
        val loginscreen = LoginScreen()
        loginscreen.firstTimeloginScreenVerification()
    }
}

