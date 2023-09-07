package com.example.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

    private static HelperClass helperClass;

    private static WebDriver driver;
    private static WebDriverWait wait;
    public final static int TIMEOUT = 10;

    private static final String USERNAME = "";
    private static final String ACCESS_KEY = "";

    private HelperClass() throws MalformedURLException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 10");
        browserOptions.setBrowserVersion("117.0");
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("username", USERNAME);
        ltOptions.put("accessKey", ACCESS_KEY);
        ltOptions.put("project", "Untitled");
        ltOptions.put("selenium_version", "4.0.0");
        ltOptions.put("w3c", true);
        ltOptions.put("build", "cucumber-testng-extent-report");
        browserOptions.setCapability("LT:Options", ltOptions);

        String gridURL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub.lambdatest.com/wd/hub";
        driver = new RemoteWebDriver(new URL(gridURL), browserOptions);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public static void openPage(String url) {
        driver.get(url);
    }


    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() throws MalformedURLException {

        if (helperClass==null) {

            helperClass = new HelperClass();
        }
    }

    public static void tearDown() {

        if(driver!=null) {
           // driver.close();
            driver.quit();
        }

        helperClass = null;
    }

}
