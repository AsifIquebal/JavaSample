package com.company.singleton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WebDriverDemo {

    @Test
    public void test01(){
        DriverInit driverInit1 = DriverInit.getInstance();
        WebDriver driver1 = driverInit1.getDriver();

        DriverInit driverInit2 = DriverInit.getInstance();
        WebDriver driver2 = driverInit2.getDriver();
        driver2.get("https://www.google.com");
    }
    /*
    * Explanation: When you run LoadURL.java, you will see browser will be launched and url will be opened in same browser.
    * We have instantiated two instance of class SingletonBrowserClass, but both give the same instance of driver.
    * */

}
