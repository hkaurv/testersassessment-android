package com.abnamro.apps.referenceandroid.screens;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openContextualActionModeOverflowMenu;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import com.abnamro.apps.referenceandroid.R;

/* homeScreen class represents the screens of the application,in this case the landing screen of ReferenceAndroid app.
it has a series of objects,representing the application screen,
and a series of methods, representing the features of that screen.
 */
public class homeScreen {

    private static final String homeScreenText="Hello World!";
    private static final int settings=R.id.title;
    private static final int floatingButton= R.id.fab;
    private static final String snackBarText = "Replace with your own action";
    private static final int snackBar=R.id.snackbar_text;

    public void homeScreenText_check()
    {
        //check if correct text is displayed on the homescreen
        onView(withText(homeScreenText))
                .check(matches(isDisplayed()));
    }

    public void clickOverflowMenu(){
        // Open the overflow menu from contextual action mode.
        openContextualActionModeOverflowMenu();
        onView(withId(settings))
                .check(matches(isDisplayed()));
    }

    public void clickSettings(){
        //tap on settings from overflow menu
        onView(withId(settings))
                .perform(click());
    }

    public void floatingButtonHomescreen_tap() {
        //tap on floating icon ,assuming it should be clickable
        onView(withId(floatingButton))
                .perform(click());
    }

    public void verifySnackBarText(){
        //checks the click on floating button shows the snackbar with text
        onView(withId(snackBar))
                .check(matches(withText(snackBarText)));
    }
}
