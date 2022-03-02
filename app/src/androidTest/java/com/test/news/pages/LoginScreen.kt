package com.test.news.pages

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import com.test.news.R
import com.test.news.tests.UserLoginFailed
import com.test.news.tests.UserLoginSucceeded

class LoginScreen {

    private val userNameTextField = R.id.editTextUserName
    private val passwordTextField = R.id.editTextPassword
    private val buttonLoginScreen = R.id.buttonLogin
    private val imageList = R.id.recyclerViewNews

    fun firstTimeloginScreenVerification() {
        onView(withId(userNameTextField))
        onView(withId(passwordTextField))
        onView(withId(buttonLoginScreen))
    }

    fun userFailsToLogin(username: String, password: String) {

        // User enters wrong username
        onView(withId(userNameTextField))
            .perform(ViewActions.typeText(username))

        // User enters correct password
        onView(withId(passwordTextField))
            .perform(ViewActions.typeText(password))

        //User clicks Login button
        onView(withId(buttonLoginScreen))
            .perform(ViewActions.click())

        //Assert that user is persisted on login screen which  acts as an anchor element
        onView(withId(buttonLoginScreen))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

    }

    fun userSuccessfullyLogsIn(username: String, password: String) {

        // User enters wrong username
        onView(withId(userNameTextField))
            .perform(ViewActions.typeText(username))

        // User enters correct password
        onView(withId(passwordTextField))
            .perform(ViewActions.typeText(password))

        //User clicks Login button
        onView(withId(buttonLoginScreen))
            .perform(ViewActions.click())

        //Verify news screen with image
        onView(withId(imageList))
            .check(ViewAssertions.matches(withId(imageList)));
    }

    fun relaunchingAppNextTime(username: String, password: String, descriptionInfo: String) {

        // User enters wrong username
        onView(ViewMatchers.withId(userNameTextField))
            .perform(ViewActions.typeText(username))

        // User enters correct password
        onView(ViewMatchers.withId(passwordTextField))
            .perform(ViewActions.typeText(password))

        //User clicks Login button
        onView(ViewMatchers.withId(buttonLoginScreen))
            .perform(ViewActions.click())

        //Verify news screen is loaded by checking login button is not shown on NewsActivity
        onView(ViewMatchers.withId(imageList))
            .check(ViewAssertions.matches(ViewMatchers.withId(imageList)));

        // relaunch app from background i.e opening next time when previously logged in
        val device: UiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.pressHome()
        device.pressRecentApps()
        val selector = UiSelector()
        val recentApp = device.findObject(selector.descriptionContains(descriptionInfo))
        recentApp.click()
        Thread.sleep(3000)
    }
}