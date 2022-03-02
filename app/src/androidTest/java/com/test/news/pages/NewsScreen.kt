package com.test.news.pages

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import com.test.news.R
import com.test.news.tests.NewsImageIsClicked
import com.test.news.tests.UserOpensAppNextTime

class NewsScreen {

    private val userNameTextField = R.id.editTextUserName
    private val passwordTextField = R.id.editTextPassword
    private val buttonLoginScreen = R.id.buttonLogin
    private val imageList = R.id.recyclerViewNews

    fun clickingOnImage(username: String, password: String) {

        // User enters wrong username
        onView(ViewMatchers.withId(userNameTextField))
            .perform(ViewActions.typeText(username))

        // User enters correct password
        onView(ViewMatchers.withId(passwordTextField))
            .perform(ViewActions.typeText(password))

        //User clicks Login button
        onView(ViewMatchers.withId(buttonLoginScreen))
            .perform(ViewActions.click())
        //Verify news screen is loaded
        onView(ViewMatchers.withId(imageList))
            .check(ViewAssertions.matches(ViewMatchers.withId(R.id.recyclerViewNews)));
        Thread.sleep(3000)
        //Image is clicked on
        val position = 0
        onView(ViewMatchers.withId(imageList))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                    position,
                    ViewActions.click()
                )
            )
    }
}