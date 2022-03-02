@file:Suppress("DEPRECATION")

package com.test.news.tests

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.test.news.R
import com.test.news.features.login.presentation.LoginActivity
import com.test.news.pages.NewsScreen
import com.test.news.utils.E2ETest
import com.test.news.utils.SmokeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.lang.Thread.sleep


@RunWith(AndroidJUnit4::class)
class NewsImageIsClicked : BaseTest() {

    @Test
    @SmokeTest
    @E2ETest
    fun imageClicked() {

        //create instance of class NewsScreen() to reference clickingOnImage() method
        val newscreen = NewsScreen()
        newscreen.clickingOnImage(USER_NAME, USER_PASSWORD)
    }

    companion object {
        private const val USER_NAME = "user"
        private const val USER_PASSWORD = "password"
    }
}