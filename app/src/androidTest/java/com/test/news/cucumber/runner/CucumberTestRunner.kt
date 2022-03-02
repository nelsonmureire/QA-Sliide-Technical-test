package com.test.news.cucumber.runner

import android.os.Bundle
import androidx.test.runner.AndroidJUnitRunner
import com.test.news.BuildConfig
import io.cucumber.android.runner.CucumberAndroidJUnitRunner
import cucumber.api.android.CucumberInstrumentationCore


class CucumberTestRunner : AndroidJUnitRunner() {

    private val CUCUMBER_TAGS_KEY = "tags"
    private val CUCUMBER_SCENARIO_KEY = "name"

    private val instrumentationCore = CucumberInstrumentationCore(this)

    override fun onCreate(bundle: Bundle) {

        val tags: String = BuildConfig.TEST_TAGS
        if (!tags.isEmpty()) {
            bundle.putString(CUCUMBER_TAGS_KEY, tags.replace("\\s", ""))
        }

        var scenario: String = BuildConfig.TEST_SCENARIO
            if (!scenario.isEmpty()) {
                scenario = scenario.replace(" ", "\\\\s");
                bundle.putString(CUCUMBER_SCENARIO_KEY, scenario)
            }

        instrumentationCore.create(bundle)
        super.onCreate(bundle)
    }

    override fun onStart() {
        waitForIdleSync()
        instrumentationCore.start()
    }

}