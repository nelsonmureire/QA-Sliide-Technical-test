# QA-Sliide-Technical-test
Repository for the Sliide technical automation  task
# Overview
This project test task aims to exapnd on the automation of the News app with emphasis on the Login and News image features. There has been attempts to add Cucumber BDD to make tests readable for non-tech team members. Owing to issues faced with Cucumber for kotlin support in step definitions, the feature file part has not been completed fully but to be further improved once more information is gathered. See steps below how to run automation test with gradle

# Tools used:
- Android studio 4.2.0
- Gradle 7.2
- Kotlin 1.5.21 
- JVM: 11.0.6 (Oracle Corporation 11.0.6+8-LTS)
- Espresso
- 
# How to run automation tests using gradle cli:
- From terminal run ./gradlew connectedDebugAndroidTest -Pcucumber -Ptags="@smoke" (The -Ptags parameter  allows to specify which tests to run i.e @smoke or @e2e)

# Gradle test run report
<img width="1105" alt="Screenshot 2022-03-02 at 01 55 56" src="https://user-images.githubusercontent.com/37104303/156279937-90373845-f580-4594-bddb-07d14693a035.png">


# How to run tests from UiTestSuite runner:
Simply locate UiTesSuite class from path in project = src/androidTest/java/com/test/news/runner/UiTestSuite.kt. Right click on file and hit Run 'UiTestSuite'

# UiTestSuite test run results:
<img width="612" alt="Screenshot 2022-03-02 at 01 55 11" src="https://user-images.githubusercontent.com/37104303/156280482-5d1ecd12-bd4d-4e1f-9281-9710edfafd79.png">

# Reference about the step definition issue encountered in Cucumber for kotlin. 
It appears kotlin does not work well with step definitions
https://cucumber.io/docs/community/faq/

# gradle(app level) Dependencies:
This section highlights key dependencies that were used in Android automation with Espresso as tool of choice.

 Test instrumentation runner:
   - testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
   
 Orchestrator:
   - androidTestUtil('androidx.test:orchestrator:1.4.1')

 BDD and Cucumber dependencies:
   - testImplementation group: 'io.cucumber', name: 'cucumber-picocontainer', version: '7.2.3'
    implementation group: 'io.cucumber', name: 'cucumber-android', version: '4.9.0'

   - androidTestImplementation('info.cukes:cucumber-android:1.2.5') {
        exclude module: 'cucumber-jvm-deps'
    }
   - androidTestImplementation 'info.cukes:cucumber-jvm-deps:1.0.5'

   - testImplementation 'io.cucumber:cucumber-java

Commented out dependencies:
 - These have been left since i am not using the custom runner and also owing to issues with step definitions in kotlin

    //def getTestTags() {
    //    project.getProperties().get('tags') ?: ''
    //}
    //def getTestScenario() {
    //    project.getProperties().get('scenario') ?: ''
    //}

    //def getInstrumentation() {
    //    project.hasProperty('cucumber') ?
    //            'com.test.news.cucumber.runner.CucumberTestRunner' :
    //            'android.support.test.runner.AndroidJUnitRunner'
    //}

    // testInstrumentationRunner getInstrumentation() #TODO: Allows to toggle between @smoke and @e2e test
    //  testInstrumentationRunner "com.test.news.cucumber.runner.CucumberTestRunner" //Owing to issue with step definition in cucumber kotlin, not used





