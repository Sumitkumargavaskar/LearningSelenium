package com.thetestingacademy.ex_selenium_11072024;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab305 {


        @Test
        public  void testVWOLoginTitle(){
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://app.vwo.com");
            Assert.assertEquals(driver.getTitle(), "Login - VWO");
            Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
            driver.quit();
        }

    }

