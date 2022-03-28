package com.testinium.testrun;

import com.testinium.driver.TestBase;
import com.testinium.pages.LoginPage;
import org.junit.Test;

public class LoginPageTest extends TestBase {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}
