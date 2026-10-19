# Appium Java API Cheat Sheet

## 1. Desired Capabilities Setup (UiAutomator2Options)
```java
UiAutomator2Options options = new UiAutomator2Options();
options.setPlatformName("Android");
options.setAutomationName("UiAutomator2");
options.setDeviceName("Android Emulator");
options.setAppPackage("com.example.app");
options.setAppActivity(".MainActivity");

// Drivers Initialization
AndroidDriver driver = new AndroidDriver(new URL("[http://127.0.0.1:4723/](http://127.0.0.1:4723/)"), options);
// By ID
WebElement elementById = driver.findElement(AppiumBy.id("com.example.app:id/button_id"));

// By Accessibility ID
WebElement elementByAccessId = driver.findElement(AppiumBy.accessibilityId("Accessibility_Label"));

// By XPath
WebElement elementByXPath = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Submit']"));

// By UIAutomator
WebElement elementByUI = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Target Text\"));"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.hideKeyboard();
driver.openNotifications();
driver.rotate(ScreenOrientation.LANDSCAPE);
driver.terminateApp("com.example.app");
driver.activateApp("com.example.app");
// Tap Gesture
public void tap(WebElement element) {
    Point location = element.getLocation();
    Dimension size = element.getSize();
    Point center = new Point(location.x + size.width / 2, location.y + size.height / 2);
    
    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    Sequence tapSequence = new Sequence(finger, 1)
        .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), center.x, center.y))
        .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
    
    driver.perform(Collections.singletonList(tapSequence));
}

// Scroll / Swipe Gesture
public void swipe(int startX, int startY, int endX, int endY) {
    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    Sequence swipe = new Sequence(finger, 1)
        .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
        .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
        .addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endX, endY))
        .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        
    driver.perform(Collections.singletonList(swipe));
}
UiAutomator2Options options = new UiAutomator2Options();
options.setPlatformName("Android");
options.setAutomationName("UiAutomator2");
options.setDeviceName("RealDevice_or_Emulator");
options.withBrowserName("chrome");

AndroidDriver driver = new AndroidDriver(new URL("[http://127.0.0.1:4723/](http://127.0.0.1:4723/)"), options);
driver.get("[https://www.google.com](https://www.google.com)");