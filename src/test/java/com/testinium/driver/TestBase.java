package com.testinium.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
    public static WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disaable-notifications");
        chromeOptions.addArguments("--disable-gpu");                     //  ╔═══════════════════════╗
        chromeOptions.addArguments("--no-sandbox");                      //  ║ BU ALANDA             ║
        chromeOptions.addArguments("disable-plugins");                   //  ║ TARAYICI AYARLARINI   ║
        chromeOptions.addArguments("disable-popup-blocking");            //  ║ TEST İÇİN             ║
        chromeOptions.addArguments("disable-translate");                 //  ║ OPTİMİZE EDİYORUZ.    ║
        chromeOptions.addArguments("disable-extensions");                //  ╚═══════════════════════╝
        chromeOptions.setExperimentalOption("w3c",false);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();                            // Tarayıcının Açılış Ayarları.
        driver.get("https://www.kitapyurdu.com/");                      // Test Edilecek Site
    }

    @After
    public void tearDown(){

        if(driver!=null){
            driver.close();
            driver.quit();

        }

    }

}

