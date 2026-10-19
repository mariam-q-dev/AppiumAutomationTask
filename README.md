# Appium Mobile Automation Testing Project

This repository contains automated test scripts for Android applications and mobile web browsers using **Appium**, **Java**, and **TestNG**.

## 🛠️ Tools & Prerequisites
- Java JDK 17+
- Node.js & npm
- Appium Server & Appium Inspector
- Android Studio & Android SDK (AVD Emulator)
- Real Android Device with USB Debugging
- Chrome Browser for Android

## 📂 Project Structure
```text
src/test/java/com/appium/test/
├── base/
│   └── BaseTest.java              # Setup & Teardown Driver logic
├── utils/
│   └── GestureUtils.java          # W3C Touch Gestures (Tap, Scroll, Slide, Drag)
└── tests/
    ├── CalculatorBuiltInTest.java  # Phase 2: Built-in App Automation
    ├── ExternalApkTest.java        # Phase 2: APK Automation
    ├── RealDeviceGestureTest.java # Phase 3: Gestures on Physical Device
    └── ChromeWebTest.java         # Phase 4: Chrome Web Automation