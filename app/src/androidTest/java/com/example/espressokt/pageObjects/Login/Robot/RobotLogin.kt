package com.example.espressokt.pageObjects.Login.Robot

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.example.espressokt.R
import com.example.espressokt.pageObjects.Login.Constants.ConstantsLogin.appTitle
import com.example.espressokt.pageObjects.Login.Constants.ConstantsLogin.buttonBack
import com.example.espressokt.pageObjects.Login.Constants.ConstantsLogin.emailValid
import com.example.espressokt.pageObjects.Login.Constants.ConstantsLogin.passwordValid
import com.example.espressokt.pageObjects.Login.Constants.ConstantsLogin.txtLogin

class RobotLogin {

    fun checkTitleScreen() {
        onView(ViewMatchers.withText(appTitle))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    fun typeEmail() {
        onView(ViewMatchers.withId(fieldExampleEmail))
            .perform(ViewActions.typeText(emailValid))
        closeSoftKeyboard()
    }

    fun typePassword() {
        onView(ViewMatchers.withId(R.id.fieldPassword)).perform(ViewActions.typeText(passwordValid))
        closeSoftKeyboard()
    }

    fun clickLogin() {
        onView(ViewMatchers.withId(R.id.buttonLogin)).perform(ViewActions.click())
    }

    fun checkLogin() {
        onView(ViewMatchers.withText(txtLogin)).check(
            ViewAssertions.matches(ViewMatchers.isDisplayed())
        )
    }

    fun clickBack() {
        onView(ViewMatchers.withText(buttonBack)).perform(ViewActions.click())
    }

//    renomeando objeto para ficar mais legível para quem for escrever os testes
    companion object {
        private val fieldExampleEmail = R.id.fieldEmail
    }
}