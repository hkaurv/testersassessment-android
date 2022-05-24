package com.abnamro.apps.referenceandroid.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
Created custom annotations as it offers additional naming flexibility for organizational purposes
This can be used in test using @SmokeTest annotation
*/
@Target( {ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SmokeTest {

}