package com.abnamro.apps.referenceandroid.tests;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.abnamro.apps.referenceandroid.screens.homeScreen;
import com.abnamro.apps.referenceandroid.utils.SmokeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

/* HomeScreen class contains UI instrumented tests for ReferenceAndroid App
that verifies UI elements and their behavior correctness
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class HomeScreenTest extends BaseTest {
    homeScreen homescreen = new homeScreen();

        @Test
        @SmokeTest
        public void givenAppIsLaunched_homeScreenIsDisplayed() {
            homeScreen.homescreenView.check(matches(isDisplayed()));
        }

        @Test
        public void whenUserClickOnOverflowMenu_settingsIsDisplayed() {
            homescreen.clickOverflowMenu();
            homeScreen.settings.check(matches(isDisplayed()));
        }

        @Test
        @SmokeTest
        public void whenUserClicksOnSettings_settingsDisappear() {
        homescreen.clickOverflowMenu();
        homescreen.clickSettings();
        homeScreen.overFlowMenu.check(matches(isDisplayed()));
        }

        @Test
        public void whenUserTapFloatingButton_snakbarIsDisplayed() {
            homescreen.tap_floatingButtonHomescreen();
            homeScreen.snackBartext.check(matches(withText(homeScreen.snackBarText)));
        }
    }

