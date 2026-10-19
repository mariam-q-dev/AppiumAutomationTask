package com.appium.test.tests;

import com.appium.test.base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorBuiltInTest extends BaseTest {

    @Test
    public void testCalculatorAddition() {
        // Locate digit 7 and press
        WebElement digit7 = driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_7"));
        digit7.click();

        // Locate plus button and press
        WebElement plusBtn = driver.findElement(AppiumBy.accessibilityId("plus"));
        plusBtn.click();

        // Locate digit 5 and press
        WebElement digit5 = driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5"));
        digit5.click();

        // Locate equals button and press
        WebElement equalsBtn = driver.findElement(AppiumBy.accessibilityId("equals"));
        equalsBtn.click();

        // Verify Result
        WebElement result = driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
        Assert.assertEquals(result.getText(), "12");
    }
}