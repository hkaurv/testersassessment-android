package com.abnamro.apps.referenceandroid.tests;

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
        public void verifyHomeScreenText() {
            homescreen.homeScreenText_check();
        }

        @Test
        public void verifyUserCanClickOnOverflowMenu() {

            homescreen.clickOverflowMenu();
        }

        @Test
        @SmokeTest
        public void verifyUserCanClickOnSettings() {
        homescreen.clickOverflowMenu();
        homescreen.clickSettings();
        }

        @Test
        public void verifySnackbarOnClickingFloatingIcon() {
            homescreen.floatingButtonHomescreen_tap();
            homescreen.verifySnackBarText();
        }
    }

