package com.company.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

    private static DriverInit instance = null;
    private WebDriver driver;
    private DriverInit(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static DriverInit getInstance(){
        if(instance == null){
            instance = new DriverInit();
        }
        return instance;
    }
    public WebDriver getDriver()
    {
        return driver;
    }
}
