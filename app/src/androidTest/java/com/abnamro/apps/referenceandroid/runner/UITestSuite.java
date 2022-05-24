package com.abnamro.apps.referenceandroid.runner;

import com.abnamro.apps.referenceandroid.tests.HomeScreenTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*This test suite is created run multiple test cases together.
  Pass the classes which we wish to run in @Suite.SuiteClasses().
  On execution it will begin to run all of the test cases added in the annotations.*/
@RunWith(Suite.class)
@Suite.SuiteClasses(HomeScreenTest.class)
public class UITestSuite {
}
