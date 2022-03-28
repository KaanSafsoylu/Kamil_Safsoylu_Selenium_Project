package com.testinium.testrun;

import com.testinium.driver.TestBase;
import com.testinium.pages.LoginPage;
import com.testinium.pages.ProductSeach;
import com.testinium.pages.PurchasePage;
import org.junit.Test;

public class PurchasePageTest extends TestBase {

    @Test

    public void purchasePageTest(){
        LoginPage loginPage       = new LoginPage();
        ProductSeach productSeach = new ProductSeach();
        PurchasePage purchasePage = new PurchasePage();

        loginPage.login();
        productSeach.seachProduct();
        purchasePage.purchasePage();


    }
}
