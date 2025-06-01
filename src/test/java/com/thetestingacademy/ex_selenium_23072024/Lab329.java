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

public class Lab329 {
    FirefoxDriver driver;

    @BeforeTest
    public void openBrowser() {
    }



    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testLab328() throws InterruptedException {
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            String URL = "https://www.flipkart.com/";
            driver.get(URL);
            driver.manage().window().maximize();

            // svg - Scalable vector graphics
            // svg, path , cicle, polygon
            // svg -> path -> g - shapes.

            //  //*[local-name()='svg']
            //  //*[name()='svg']  , contains(), text(), name()

            driver.findElement(By.name("q")).sendKeys("macmini");
            List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
            svgElements.get(0).click();
        }
        @AfterTest
        public void closeBrowser() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //   driver.quit();
           // driver.close();
        }

    }








