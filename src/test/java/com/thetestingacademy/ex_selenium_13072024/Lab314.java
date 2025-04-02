package com.thetestingacademy.ex_selenium_13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Lab314 {
    @Test
    public void testVerifyFREETrial() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.id("login-password"));
        passwordInputBox.sendKeys("password@321");

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Verify the message
        //WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_msg.getText(), "Your email, password, IP address or location did not match");

        // id - , name , class not unique ->
        // link text and partial link  - a tag anchor
        //WebElement freeTrialLink = driver.findElement(By.linkText("Start a free trial"));
        WebElement freeTrialLink = driver.findElement(By.partialLinkText("Start a free"));
        freeTrialLink.click();
        WebElement enterEmail = driver.findElement(By.id("page-v1-step1-email"));
        enterEmail.sendKeys("admin@admin.com");

        WebElement gdprConsentCheckbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        gdprConsentCheckbox.click();

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_msg_email_exist = driver.findElement(By.className("invalid-reason"));
        System.out.println(error_msg_email_exist.getText());




        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }
}
