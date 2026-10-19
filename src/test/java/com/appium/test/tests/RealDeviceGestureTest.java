package com.appium.test.tests;

import com.appium.test.base.BaseTest;
import com.appium.test.utils.GestureUtils;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RealDeviceGestureTest extends BaseTest {

    @Test
    public void testMobileGestures() {
        GestureUtils gesture = new GestureUtils(driver);

        // 1. Tap Test
        WebElement item = driver.findElement(AppiumBy.accessibilityId("Views"));
        gesture.tap(item);

        // 2. Scroll Test
        gesture.scrollDown();

        // 3. Slide Test
        gesture.swipe(500, 1000, 100, 1000);

        // 4. Drag & Drop Test (Targeting drag handles if visible)
        WebElement dragDot = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
        WebElement targetDot = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_2"));
        gesture.dragAndDrop(dragDot, targetDot);
    }
}