package com.juaracoding.pcmautomation.cucumber.practicetestautomation.impl;

import com.juaracoding.pcmautomation.selenium.page.practicetestautomation.HomePage;
import com.juaracoding.pcmautomation.selenium.page.practicetestautomation.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class LoginNegatif {

    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage ;
    private HomePage homePage;

    public LoginNegatif(){
        this.driver = LoginOutlineHooks.driver;
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        extentTest = LoginOutlineHooks.extentTest;
    }
}
