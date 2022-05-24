# ReferenceAndroid App test automation

The purpose of this assignment is to test the app ReferenceAndroid .

## Built with 
1. Android Studio
2. Java programming language
3. Espresso API to write Android UI tests
4. Git

## Prerequisites
Android SDK 32

Java v8 JDK or higher versions

## Espresso Framework

I use Espresso API for creating UI Instrumented tests for Android App.
I have taken some time as part of this assignment to learn Espresso and implement these tests.
I have used Page Object Design Pattern _(alternately known as the Screen Object Design Pattern)_ for my tests.
Below is the explanation of the structure -

_/testersassessment-android/app/src/androidTest/java/com/abnamro/apps/referenceandroid/_

###### 1- 'Runner' folder

This folder contains the UITest Suite, which can use to run all the tests together by adding them to the annotation.

###### 2-'Screen' folder

It contains all Page object classes. 
These classes represent the actual screens of the application. A Page Object class will contain a series of objects representing the application screen and a series of methods representing the features of that screen.  

###### 3-‘Tests' folder:

It contains all test classes.
I have used the approach to write test cases per screen (Homescreen) and not per action as it is easy to maintain, and we don't end up having an extensive list of tests.
These classes define the user flow by referencing the screen object class methods.

###### 4-‘Utils' folder:

It contains an interface for custom annotation and can also be used to add helpers, extensions to the Espresso, and scripts.  
 
 
 ## Test Approach

Since this is an open assignment without any specific requirements, I have implemented test cases to check the behavior and correctness of the app components. 
Assuming whatever I see on the app is intended and as per the requirements.

I have tried to keep the tests as simple and understandable as possible.
Four main tests are written here - 
###### 1-givenAppIsLaunched_homeScreenIsDisplayed()
As the app is launched and user lands on the homescreen, he verifies correct(Intended) text is displayed.

###### 2-whenUserClickOnOverflowMenu_settingsIsDisplayed()
The user should be able to click on the overflow menu and settings should be displayed.

###### 3-whenUserClicksOnSettings_settingsDisappear()
As the user clicks on the settings,settings disappear and overflow menu is displayed.

###### 4-whenUserTapFloatingButton_snakbarIsDisplayed()
As the user tap on floating button, snackbar is displayed and he should be able to verify snackbar text.


## Executing Test Cases

You can execute test cases in the following ways-

1-Different ways to run your tests with Gradle; make sure to be in your project path before executing the command.
./gradlew connectedAndroidTest
 
 
2-Navigate to UITestSuite class from the runner package in the framework 
_/testersassessment-android/app/src/androidTest/java/com/abnamro/apps/referenceandroid/runner/UITestSuite.java_

Run this class with the Run icon present before the class.

## Test results 
HTML test result files: _path_to_your_project/module_name/build/reports/androidTests/connected/_ directory.

## Run Test on CI Pipeline

- Add stage ('Instrumental Test') to JenkinsFile

 stage('test'){
            steps {
                sh "$ADB start-server"
                sh "./gradlew connectedAndroidTest"
                
 - Also,You can use the Gradle plugin as part of a Jenkins CI controlled job.
 

## Learnings

While working on this assignment I came across an issue with Emulator -
When the app is left running on the Emulator, it stops working and give an error as “The System UI isn’t responding” with option to close the App or Wait.

If you press wait , then it might take tremendous amount of time to actually start working again.

Causes-
I found out that it is caused whenever I resize the emulator.

I tried following and solved my issue.
1. Solution 01 - Change Emulated Performance
2. Solution 02 - Create New Emulator - (Pixel 4 or Pixel 4 XL)
3. Solution 03 - (Temporary) - Wipe Data



