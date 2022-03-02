package com.test.news.runner

import com.test.news.tests.*
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(FirstTimeAppLaunchNoLogin::class,
    UserLoginFailed::class,
    UserLoginSucceeded::class,
    UserOpensAppNextTime::class,
    NewsImageIsClicked::class)

class UiTestSuite