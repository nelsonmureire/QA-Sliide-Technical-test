@file:Suppress("DEPRECATION")

package com.test.news.cucumber.steps

import android.content.Intent
import androidx.test.rule.ActivityTestRule
import com.test.news.features.login.presentation.LoginActivity
import com.test.news.pages.LoginScreen
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then

class LoginSteps {

    private val loginscreen = LoginScreen()

    private val activityTestsRule = ActivityTestRule(LoginActivity::class.java, false, false)

    @Given("^app is launched$")
    fun userLaunchesApp() {
        activityTestsRule.launchActivity(Intent())
    }

    @Then("^login screen with user name and password entries and login button is displayed$")
    fun verifyLoginScreen() {
        loginscreen.firstTimeloginScreenVerification()
    }


}