package com.testinium.pages;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductSeach {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductSeach.class);

    public ProductSeach() {
        methods = new Methods();
    }

    public void seachProduct() {
        methods.sendKeys(By.id("search-input"), "Oyuncak");                                                     // Arama çubuğuna Oyuncak yazılır
        methods.click(By.cssSelector(".common-sprite.button-search"));                                              // Arama Tuşuna Basılır
        methods.scrollWithAction(By.cssSelector("#product-table > div:nth-child(7)"));                              // 7. Satıra Scroll Yapılır.
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[8]")).click();                                   //-----------------------------
        methods.waitBySecond(1);
        Assert.assertTrue(methods.isElementVisible(By.className("swal2-title ky-swal-title-single")));
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[7]")).click();
        methods.waitBySecond(1);
        Assert.assertTrue(methods.isElementVisible(By.className("swal2-title ky-swal-title-single")));
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[6]")).click();                                 // 4 ÜRÜN FAVORİYE EKLENİR.
        methods.waitBySecond(1);
        Assert.assertTrue(methods.isElementVisible(By.className("swal2-title ky-swal-title-single")));
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[5]")).click();
        methods.waitBySecond(1);
        Assert.assertTrue(methods.isElementVisible(By.className("swal2-title ky-swal-title-single")));           //----------------------------------
        methods.click(By.cssSelector(".logo-text>a>img"));                                                      // Ana Sayfaya gidilir.
        methods.waitBySecond(2);
        methods.click(By.className("lvl1catalog"));
        methods.waitBySecond(2);
        methods.click(By.xpath("//*[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySecond(2);
        methods.selectByText(By.cssSelector(".sort>select"), "Yüksek Oylama");                            //Yüksek oylama alanı seçilicek
        methods.waitBySecond(2);
        methods.hoverElement(By.xpath("(//*[contains(text(),\"Tüm Kitaplar\")])[3]"));                       //Açılır pencerenin üzerine gelir.
        methods.waitBySecond(2);
        methods.findElement(By.xpath("//a[contains(@href, 'kategori/kitap-hobi/1_212.html')]")).click();     //Açılır pencereden hobi sekmesi seçilir.
        methods.randomSelect();
        methods.waitBySecond(3);






    }


}


