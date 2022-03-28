package com.testinium.testrun;

import com.testinium.driver.TestBase;
import com.testinium.pages.LoginPage;
import com.testinium.pages.ProductSeach;
import org.junit.Test;

public class ProductSearchTest extends TestBase {

    @Test

    public void productSearchTest(){
        LoginPage loginPage       = new LoginPage();
        ProductSeach productSeach = new ProductSeach();
        loginPage.login();
        productSeach.seachProduct();
    }




}
