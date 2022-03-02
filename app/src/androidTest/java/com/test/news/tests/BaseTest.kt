@file:Suppress("DEPRECATION")

package com.test.news.tests

import androidx.test.rule.ActivityTestRule
import com.test.news.features.login.presentation.LoginActivity
import org.junit.Rule

open class BaseTest {
    @Rule
    @JvmField
    var activityTestsRule = ActivityTestRule(LoginActivity::class.java, true, true)
}