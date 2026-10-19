package com.appium.test.tests;

import com.appium.test.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ChromeWebTest extends BaseTest {

    @Test
    public void testGoogleSearchOnChrome() {
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Appium Mobile Automation");
        searchBox.submit();
    }
}