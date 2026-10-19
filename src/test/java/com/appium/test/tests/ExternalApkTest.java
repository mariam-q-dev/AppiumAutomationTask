package com.appium.test.tests;

import com.appium.test.base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExternalApkTest extends BaseTest {

    @Test
    public void testApkInteractions() {
        // Locate first interactive element by Accessibility ID
        WebElement firstElement = driver.findElement(AppiumBy.accessibilityId("App"));
        firstElement.click();

        // Locate second element by XPath
        WebElement secondElement = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Action Bar']"));
        secondElement.click();
    }
}