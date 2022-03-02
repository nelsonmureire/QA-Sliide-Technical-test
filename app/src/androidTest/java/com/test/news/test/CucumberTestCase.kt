package com.test.news.test

import cucumber.api.CucumberOptions


@CucumberOptions(features = ["features"],
    glue = ["com.test.news.cucumber.steps"],
    tags = ["@e2e", "@smoke"])
class CucumberTestCase
