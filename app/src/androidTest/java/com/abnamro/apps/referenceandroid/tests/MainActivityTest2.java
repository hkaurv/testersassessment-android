package com.abnamro.apps.referenceandroid.tests;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.abnamro.apps.referenceandroid.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.abnamro.apps.referenceandroid.pageObjects.homescreen;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest2  {
    homescreen homescreen = new homescreen();
        @Rule
        public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
                new ActivityScenarioRule<>(MainActivity.class);

        @Test
        public void clickFloatingIcon () {
            homescreen.floatingButtonHomescreen();
        }

        @Test
        public void clickOverflow () {
            homescreen.clickOverflowMenu();
        }

        @Test
        public void clickSettings () {
            homescreen.clickOverflowMenu();
            homescreen.settingsHomeScreen();

        }
    }

