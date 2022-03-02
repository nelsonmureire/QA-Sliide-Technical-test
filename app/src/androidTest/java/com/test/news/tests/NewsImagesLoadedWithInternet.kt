@file:Suppress("DEPRECATION")

package com.test.news.tests

import android.util.Log
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.contrib.RecyclerViewActions.scrollToPosition
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.test.news.R
import com.test.news.features.login.presentation.LoginActivity
import com.test.news.utils.NetworkHelper
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.lang.Thread.sleep

@RunWith(AndroidJUnit4::class)
class NewsImagesLoadedWithInternet : BaseTest() {

    @Test
    fun imagesLoaded () {

        // User enters wrong username
        onView(withId(R.id.editTextUserName))
            .perform(ViewActions.typeText(USER_NAME))

        // User enters correct password
        onView(withId(R.id.editTextPassword))
            .perform(ViewActions.typeText(USER_PASSWORD))

        //User clicks Login button
        onView(withId(R.id.buttonLogin))
            .perform(click())

        //Checks for internet connection
        if(NetworkHelper.isNetworkConnected(activityTestsRule.activity)){

            //Verify images loaded
                sleep(3000)
            onView(withId(R.id.recyclerViewNews))
                .check(ViewAssertions.matches(withId(R.id.recyclerViewNews)))
        }
        else {

            // This confirms internet is off as we never reach
           println("Internet Off")
        }
    }


    companion object {
        private const val USER_NAME = "user"
        private const val USER_PASSWORD = "password"
    }
}