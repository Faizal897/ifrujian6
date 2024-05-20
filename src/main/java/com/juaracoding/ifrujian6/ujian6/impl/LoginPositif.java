/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author FX504GE a.k.a. Imam FR
Java Developer
Created on 03/05/2024 10:39 AM
@Last Modified 03/05/2024 10:39 AM
Version 1.0
*/

package com.juaracoding.ifrujian6.ujian6.impl;

import com.juaracoding.ifrujian6.ujian6.connection.Constants;
import com.juaracoding.ifrujian6.ujian6.page.HomePage;
import com.juaracoding.ifrujian6.ujian6.page.LoginPage;
import com.juaracoding.ifrujian6.ujian6.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPositif {
    public static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage;
    private HomePage homePage;
//    private RunnerUjian runnerUjian;


    public LoginPositif() {
//        runnerUjian = new RunnerUjian();
//        DriverSingleton.getInstance(runnerUjian.getBrowser());
//        this.driver = DriverSingleton.getDriver();
//        this.driver.get(Constants.URL_LOGIN);
        this.driver = Test1Hooks.driver;
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        extentTest = Test1Hooks.extentTest;
    }

    @When("Test001 Membuka Halaman Login")
    public void test001_membuka_halaman_login() {
        this.driver.get(Constants.URL_LOGIN);
        extentTest.log(LogStatus.PASS, "Test001 Membuka Halaman Login");
    }

    @And("Test001 Clear Field Username Dan Password")
    public void test001_clear_field_username_dan_password() {
        loginPage.clear();
        extentTest.log(LogStatus.PASS, "Test001 Clear Field Username Dan Password");
    }

    @And("^Test001 Input TextField (.*) Yang Valid One")
    public void test001_input_textfield_username_yang_valid_one(String username) {
        loginPage.inputUsername(username);
        extentTest.log(LogStatus.PASS, "Test001 Input TextField Username Yang Valid One");
    }

    @And("^Test001 Input TextField (.*) Yang Valid Two")
    public void test001_input_textfield_password_yang_valid_one(String password) {
        loginPage.inputUsername(password);
        extentTest.log(LogStatus.PASS, "Test001 Input TextField Password Yang Valid One");
    }

    @And("Test001 Klik Tombol Login")
    public void test001_klik_tombol_login() {
        loginPage.clickLogin();
        extentTest.log(LogStatus.PASS, "Test001 Klik Tombol Login");
    }

    @Then("Test001 Validasi Label Halaman Home")
    public void test001_validasi_label_halaman_home() {
        String strValidation = homePage.homePageValidation();
        Assert.assertEquals("4 Fitur Unggulan", strValidation);
        extentTest.log(LogStatus.PASS, "Test001 Validasi Label Halaman Home");
    }

    @When("Test001 Tekan Tombol Logout")
    public void test001_tekan_tombol_logout() {
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("arguments[0].click()", homePage.logout());
        extentTest.log(LogStatus.PASS, "Test001 Tekan Tombol Logout");
    }

    @Then("Test001 Validasi Label Halaman Login")
    public void test001_validasi_label_halaman_login() {
        GlobalFunction.delay(2);
        Assert.assertEquals("Sign In", loginPage.loginFormValidation());
        extentTest.log(LogStatus.PASS, "Test001 Validasi Label Halaman Login");
    }
}


//    @Test(priority = 0)
//    public void validLogin(){
//
////        loginPage.inputUsername("Admin");//STEP-2
////        loginPage.inputPassword("Admin@123");//STEP-3
////        loginPage.clickLogin();//STEP-4
////        String strValidation = homePage.homePageValidation();
////        System.out.println("Home Page Validation "+strValidation+" terlihat, Berhasil Log In");
////        GlobalFunction.delay(2);
////        Assert.assertEquals("4 Fitur Unggulan",strValidation);//STEP-5
//    }
//
//    @Test(priority = 1)
//    public void logout(){
////        JavascriptExecutor js = (JavascriptExecutor) this.driver;
////        js.executeScript("arguments[0].click()",homePage.logout());
//        GlobalFunction.delay(2);
//        Assert.assertEquals("Sign In",loginPage.loginFormValidation());
//        System.out.println("Logo Sign In Terlihat, Berhasil Log Out");
//    }
//
//    @AfterTest
//    public void closeDriver(){
//        DriverSingleton.closeObjectInstance();
//    }
//}
