package com.abnamro.apps.referenceandroid.screens;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.openContextualActionModeOverflowMenu;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;

import com.abnamro.apps.referenceandroid.R;

/* homeScreen class represents the screens of the application,in this case the landing screen of ReferenceAndroid app.
it has a series of objects,representing the application screen,
and a series of methods, representing the features of that screen.
 */
public class homeScreen {

    public static final ViewInteraction homescreenView=onView(withText("Hello World!"));
    private static final ViewInteraction floatingIcon=onView(withId(R.id.fab));
    public static final ViewInteraction snackBartext=onView(withId(R.id.snackbar_text));
    public static final ViewInteraction settings=onView(withId(R.id.title));
    public static final ViewInteraction overFlowMenu=onView(withId(R.id.toolbar));
    public static final String snackBarText = "Replace with your own action";

    public void clickOverflowMenu(){
        // Open the overflow menu from contextual action mode.
        openContextualActionModeOverflowMenu();
    }

    public void clickSettings(){
        //tap on settings from overflow menu
        settings.perform(click());
    }

    public void tap_floatingButtonHomescreen() {
        //tap on floating icon ,assuming it should be clickable
       floatingIcon.perform(click());
    }
}
