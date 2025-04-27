package ex_selenium_18072024;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class Lab318 {
    FirefoxDriver driver;

    @BeforeTest
    public void openBrowser() {
    }

        @Test(groups = "QA")
        @Description("Test Case Description")
        public void testVerifyFREETrial() throws InterruptedException {
            WebDriver driver = new FirefoxDriver();

            // Implicit Wait - Bad
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // Gives No Such Element Exception.

            // Navigate to the - https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067
            driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
            System.out.println(driver.getTitle());
            // Search Element
            driver.manage().window().maximize();
            // #gh-ac
            // input[id="gh-ac"] -> xpath -> //input[@id="gh-ac"]
            WebElement searchBox = driver.findElement(By.cssSelector("abc"));
            searchBox.sendKeys("macmini"); // Find the "macmini"

            WebElement searchBoxButton = driver.findElement(By.id("gh-search-btn"));
            searchBoxButton.click();

            // Why Do We Need Waits In Selenium?
            // do this
            // Thread.sleep(3) - JVM to stop the execution - Worst type wait. - Halt JVM
            // do that



        }
        @AfterTest
        public void closeBrowser() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();
        }
    }



