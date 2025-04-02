package com.thetestingacademy.ex_selenium_13072024;

//import org.openqa.selenium.PageLoadStrategy;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Lab309 {
    public static void main(String[] args) {
       // FirefoxOptions firefoxOptions = new FirefoxOptions();
       // firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
      //  WebDriver driver = new FirefoxDriver(firefoxOptions);
      //  driver.get("https://app.vwo.com/#/login");
       // System.out.println(driver.getTitle());
     //   driver.quit();

        EdgeOptions edgeOptions = new EdgeOptions();
      //  Page speed code
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
