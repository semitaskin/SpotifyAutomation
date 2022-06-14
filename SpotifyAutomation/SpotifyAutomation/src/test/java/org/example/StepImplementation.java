package org.example;


import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;


import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation extends BaseTest{
    @Step("<Key> saniye bekle.")
    public void waitSecont(int key) throws Exception{
        Thread.sleep(key*1000);
    }

    @Step("Css li <element> elemente tıkla.")
    public void clickElementByCss(String element){
        driver.findElement(By.cssSelector(element)).click();
    }

    @Step("Id li <element> elemente tıkla.")
    public void clickElementById(String element){
        driver.findElement(By.id(element)).click();
    }

    @Step("Xpath li <element> elemente tıkla.")
    public void clickElementByXpath(String element){
        driver.findElement(By.xpath(element)).click();
    }

    @Step("Css li <element> elemeniti bul ve <key> değeri yaz.")
    public void sendKeysByCss (String element,String key){
        driver.findElement(By.cssSelector(element)).sendKeys(key);
    }

    @Step("Id li <element> elemeniti bul ve <key> değeri yaz.")
    public void sendKeysById (String element,String key){
        driver.findElement(By.id(element)).sendKeys(key);
    }

    @Step("Xpath li <element> elemeniti bul ve <key> değeri yaz.")
    public void sendKeysByXpath(String element,String key){
        driver.findElement(By.xpath(element)).sendKeys(key);
    }
}
