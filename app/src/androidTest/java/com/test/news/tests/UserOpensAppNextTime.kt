@file:Suppress("DEPRECATION")

package com.test.news.tests

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import androidx.test.rule.ActivityTestRule
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import com.test.news.R
import com.test.news.features.login.presentation.LoginActivity
import com.test.news.pages.LoginScreen
import com.test.news.utils.E2ETest
import com.test.news.utils.SmokeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.lang.Thread.sleep
import kotlin.math.log


@RunWith(AndroidJUnit4::class)
class UserOpensAppNextTime : BaseTest() {

    @Test
    @SmokeTest
    @E2ETest
    fun userOpensAppFromBackground() {

        //create instance of class LoginScreen to reference  relaunchingAPPNextTime() method
       val loginscreen = LoginScreen()
        loginscreen.relaunchingAppNextTime(USER_NAME, USER_PASSWORD, DESCRIPTION_INFO)
    }

    companion object {
        private const val USER_NAME = "user"
        private const val USER_PASSWORD = "password"
        private const val DESCRIPTION_INFO = "News"
    }
}