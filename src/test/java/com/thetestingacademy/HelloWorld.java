package com.thetestingacademy;

//import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {
    public static void main(String[] args) {

        //EdgeDriver driver = new EdgeDriver();
       FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://courses.thetestingacademy.com/");
    }



}
