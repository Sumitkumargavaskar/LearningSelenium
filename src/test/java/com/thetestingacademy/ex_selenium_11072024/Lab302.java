package com.thetestingacademy.ex_selenium_11072024;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab302 {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
    }
}
