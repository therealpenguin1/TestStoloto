package com.mobile.MobileTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppTest
{
	private static AppiumDriver<WebElement> driver;
	private static DesiredCapabilities cap;
	
	public static void Android_LaunchApp() throws MalformedURLException
{
		cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
        cap.setCapability("noReset", "true");
        cap.setCapability("fullReset", "false");
        cap.setCapability("platformVersion", "8.0");
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("appPackage", "ru.stoloto.mobile");
		cap.setCapability("appActivity", ".redesign.MainActivity");
	 		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		Assert.assertNotNull(driver);
		}
	
	public static void CloseApp() {
		driver.quit();
	}
}
