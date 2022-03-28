package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class PurchasePage {
    Methods methods;
    Logger logger = LogManager.getLogger(PurchasePage.class);

    public PurchasePage() {
        methods = new Methods();
    }

    public void purchasePage(){

        methods.findElement(By.cssSelector("#button-cart > span")).click();
        methods.waitBySecond(2);
        methods.hoverElement(By.xpath("//*[@class='menu top my-list']//li"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@class='menu top my-list']//li//li[1]"));
        methods.waitBySecond(2);
        methods.hoverElement(By.xpath("(//*[@class='product-cr'])[3]"));
        methods.waitBySecond(2);
        methods.findElement(By.xpath("(//*[@class='fa fa-heart-o'])[3]")).click();
        methods.waitBySecond(2);
        methods.click(By.id("sprite-cart-icon"));
        methods.waitBySecond(2);
        methods.click(By.id("js-cart"));
        methods.sendKeys(By.xpath("(//input[@name='quantity'])[2]"),"1");
        methods.waitBySecond(2);
        methods.click(By.xpath("(//*[@class='fa fa-refresh green-icon'])[2]"));
        methods.waitBySecond(5);
        methods.click(By.xpath("//*[@class='right']/a"));
        methods.waitBySecond(5);
        methods.click(By.xpath("//*[@class='htabs alt']/a[2]"));
        methods.waitBySecond(2);
        methods.sendKeys(By.id("address-firstname-companyname"),"Testinium");
        methods.sendKeys(By.id("address-lastname-title"),"Jr. QA Engineer");
        methods.click(By.xpath("//*[@id='address-zone-id']"));
        methods.click(By.xpath("//*[@id='address-zone-id']/option[2]"));
        methods.click(By.xpath("//*[@id='address-county-id']"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@id='address-county-id']/option[2]"));
        methods.waitBySecond(2);
        methods.sendKeys(By.xpath("//*[@id='address-address-text']"),"adana merkez patlıyo herkes");
        methods.sendKeys(By.xpath("//*[@id='address-mobile-telephone']"),"5517950133");
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@id='button-checkout-continue']"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@id='button-checkout-continue']"));
        methods.waitBySecond(2);
        methods.sendKeys(By.xpath("//*[@id='credit-card-owner']"),"Kamil Safsoylu");
        methods.waitBySecond(2);
        methods.sendKeys(By.xpath("//*[@id='credit_card_number_1']"),"4543");
        methods.waitBySecond(1);
        methods.sendKeys(By.xpath("//*[@id='credit_card_number_2']"),"6003");
        methods.waitBySecond(1);
        methods.sendKeys(By.xpath("//*[@id='credit_card_number_3']"),"4234");
        methods.waitBySecond(1);
        methods.sendKeys(By.xpath("//*[@id='credit_card_number_4']"),"2145");
        methods.waitBySecond(1);
        methods.click(By.xpath("//*[@id='credit-card-expire-date-month']"));
        methods.waitBySecond(3);
        methods.click(By.xpath("//*[@id='credit-card-expire-date-month']/option[5]"));
        methods.waitBySecond(3);
        methods.sendKeys(By.xpath("//*[@id='credit-card-security-code']"),"345");
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@id='credit-card-expire-date-year']"));
        methods.waitBySecond(3);
        methods.click(By.xpath("//*[@id='credit-card-expire-date-year']/option[5]"));
        methods.waitBySecond(3);
        methods.click(By.xpath("//*[@id='button-checkout-continue']"));
        methods.waitBySecond(5);
        methods.click(By.className("checkout-logo"));
        methods.waitBySecond(2);
        methods.hoverElement(By.className("menu top login"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//a[contains(@href, 'https://www.kitapyurdu.com/index.php?route=account/logout')]"));
        methods.waitBySecond(5);





    }






}
