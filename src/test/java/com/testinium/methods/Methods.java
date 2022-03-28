package com.testinium.methods;

import com.testinium.driver.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Methods {

    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;                                         // JavaScript HTML ve DOM’a direkt erişip yönetebilen bir script dili olduğundan JavascriptExecutor'dan destek alıyoruz.

    Logger logger = LogManager.getLogger(Methods.class);

    public Methods(){

    driver   = TestBase.driver;
    wait     = new FluentWait<>(driver);                                // FluentWait = Nesne bulunana veya zaman aşımı gerçekleşene kadar düzenli aralıklarla web elementini kontrol eder.
    wait.withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofMillis(300))                       // Web Sürücüsünün Koşulu Beklemesi İçin Süre Tanımlamaları.
            .ignoring(NoSuchElementException.class);
    jsdriver = (JavascriptExecutor)driver;
    }

    public WebElement findElement(By by){                              // findElement = Locator ile eşleşen ilk web elementini döndürür.
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by) {                                        // Locator ile eşleşen elemente tıklama eylemi gerçekleştirir.
        findElement(by).click();
    }

    public void waitBySecond(long seconds){
        try{
            Thread.sleep(seconds*1000);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void sendKeys(By by, String text){                          // Locator ile eşleşen elemente yazı yazdırır.

        findElement(by).sendKeys(text);
    }

    public boolean isElementVisible(By by){                           // Locator ile eşleşen elementin sayfa üzerindeki görünürlüğünün test edildiği metot.
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            logger.info("true");
            return true;
        }catch (Exception e){
            logger.info("false"+e.getMessage());
            return false;
        }
    }

    public void scrollWithAction(By by){                             // Locator'ı verilmiş alana sayfayı scroll eden metot.
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public Select getSelect(By by){                                 // Locatordaki alandan değer seçer.
        return new Select(findElement(by));
    }

    public void selectByText(By by,String text) {                  // Locatordaki alanda yazan yazıya göre değer seçer.
        getSelect(by).selectByVisibleText(text);
    }

    public void scrollWithJavaScript(By by){                       // JavaScriptExecutor ile scroll işlemini yaptırır
        jsdriver.executeScript("arguments[0].scrollIntoView()",findElement(by));
    }

    public String getAttribute(By by, String attributeName){      // getAttribute = web elementinin niteliğinin istediğimiz gibi olup olmadığını kontrol eder true veya null değeri döndürür.
        return findElement(by).getAttribute(attributeName);
    }

    public String getText(By by){                                // Locatordaki text'i yazdırır.
        return findElement(by).getText();
    }

    public String getValue(By by){                              // Locatordaki değeri yazdırır.
        return jsdriver.executeScript("return arguments[0].value",findElement(by)).toString();
    }
    public void hoverElement(By by) {                           // Locatorda verilmiş konumun üzerinde durur.
        Actions action = new Actions(driver);
        logger.info("True" + by);
        action.moveToElement(findElement(by)).build().perform();
    }

    public void randomSelect() {

        List<WebElement> productSelect = driver.findElements(By.cssSelector(".pr-img-link"));

        int maxProducts = productSelect.size();

        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);

        productSelect.get(randomProduct).click();

    }


}
