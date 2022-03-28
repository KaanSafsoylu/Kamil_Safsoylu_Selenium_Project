package com.testinium.pages;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;

    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.click(By.cssSelector(".menu-top-button.login>a"));                        // Anasayfadaki Giriş Yap Butonuna Tıklar.
        methods.sendKeys(By.id("login-email"),"ksafsoylu1@hotmail.com");             // E-Mail Bilgilerini Girer.
        methods.sendKeys(By.id("login-password"),"Testaccount1");                    // Password Bilgilerini Girer.
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));       //  Giriş Yap Butonuna Tıklar
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".attention")));       //  Login Olma Kontrolü Yapar.

    }











}
