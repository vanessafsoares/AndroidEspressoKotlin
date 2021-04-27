package com.example.espressokt

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testeLogin() {
        onView(withText("Faça o login")).check(matches(isDisplayed()))
        onView(withId(R.id.fieldEmail)).perform(typeText("ness@gmail.com"))
        closeSoftKeyboard()
        onView(withId(R.id.fieldPassword)).perform(typeText("12345678"))
        closeSoftKeyboard()
        onView(withId(R.id.buttonLogin)).perform(click())
        onView(withText("Logado com sucesso")).check(matches(isDisplayed()))
        onView(withText("Voltar")).perform(click())
        onView(withText("Faça o login")).check(matches(isDisplayed()))

    }

    @Test
    fun testeLoginFalha() {
        onView(withText("Faça o logins")).check(matches(isDisplayed()))
    }
}