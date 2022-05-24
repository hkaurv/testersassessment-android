package com.abnamro.apps.referenceandroid.tests;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import com.abnamro.apps.referenceandroid.MainActivity;
import org.junit.Rule;
/*This Base class has the rule which can be shared among different test cases as we add new screens.
Any activity which needs to be done before or after the test can be added here which will be common to all tests.
it can be extended to sub classes  using the keyword "extends". */
public class BaseTest {
    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);
    }
