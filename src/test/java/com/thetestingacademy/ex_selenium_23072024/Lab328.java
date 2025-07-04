package com.thetestingacademy.ex_selenium_23072024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Lab328 {
    FirefoxDriver driver;

    @BeforeTest
    public void openBrowser() {
    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testLab328() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String URL = "https://awesomeqa.com/webtable1.html";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement table = driver. findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> rows_tables = table.findElements(By.tagName("tr"));
        System.out.println(rows_tables.size());
        for (int i = 0; i < rows_tables.size(); i++) {
            List<WebElement> col = rows_tables.get(i).findElements(By.tagName("td"));
            for(WebElement c:col){
                System.out.println(c.getText());
            }

        }





    }


    @AfterTest
    public void closeBrowser() {
      //  driver.quit();
    }

}




