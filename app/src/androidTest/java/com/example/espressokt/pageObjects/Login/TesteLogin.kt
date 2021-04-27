package com.example.espressokt.pageObjects.Login

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.espressokt.MainActivity
import com.example.espressokt.pageObjects.Login.Robot.RobotLogin
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TesteLogin {

    private val robot = RobotLogin()

    @get:Rule
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun LoginPage() {
        robot.checkTitleScreen()
        robot.typeEmail()
        robot.typePassword()
        robot.clickLogin()
        robot.checkLogin()
        robot.clickBack()
        robot.checkTitleScreen()
    }
}