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


 public class Lab317 {
     // Navigate to the - https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067
     // Find the "mackmini" click search
     // print all the titles
     FirefoxDriver driver;

     @BeforeTest
     public void openBrowser() {


     }

     @Test(groups = "QA")
     @Description("Test Case Description")
     public void testVerifyFREETrial() throws InterruptedException {
         WebDriver driver = new FirefoxDriver();
         driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
         System.out.println(driver.getTitle());
         driver.manage().window().maximize();
         //Search Element
         // #gh-ac
         // input[id="gh-ac"] -> xpath -> //input[@id="gh-ac"]
         WebElement searchBox = driver.findElement(By.cssSelector("input[id='gh-ac']"));
         searchBox.sendKeys("macmini");    // Find the "macmini"
         //click search
         // .gh-spr
         // input[value="Search"]
         WebElement searchBoxButton = driver.findElement(By.id("gh-search-btn"));
         searchBoxButton.click();
         Thread.sleep(3000);
//print all the titles
         // .s-item__title
         List<WebElement> searchTitles = driver.findElements(By.cssSelector(".s-item__title"));
         List<WebElement> searchTitlesPrices = driver.findElements(By.cssSelector(".s-item__price"));
         //   for (WebElement title : searchTitles) {
         //       System.out.println(title.getText());
         //  }
         //  for (WebElement prices : searchTitlesPrices) {
         //      System.out.println(prices.getText());
         //  }

         // Ensure both lists are of the same size to avoid IndexOutOfBoundsException
         int size = Math.min(searchTitles.size(), searchTitlesPrices.size());
         for (int i = 0; i < size; i++) {
             System.out.println("Title: " + searchTitles.get(i).getText() + " || " + "Price: " + searchTitlesPrices.get(i).getText());
             System.out.println();
         }


     }

     @AfterTest
     public void closeBrowser() {
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         // driver.quit();
     }
 }
