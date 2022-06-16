package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Mustafa_Task1 {

        public static void main(String[] args) throws InterruptedException {

                //1. Open Chrome browser
                WebDriverManager.chromedriver().setup();

                WebDriver driver = new ChromeDriver();

                driver.manage().window().maximize();

                //2. Go to https://www.etsy.com
                driver.get("https://www.etsy.com");

                WebElement agreeButton=driver.findElement(By.xpath("//*[@id=\"gdpr-single-choice-overlay\"]/div/div[2]/div[2]/button"));
                agreeButton.click();
                Thread.sleep(5000);

                //3. Search for “wooden spoon”
                WebElement searchBox = driver.findElement(By.name("search_query"));
                searchBox.sendKeys("wooden spoon" + Keys.ENTER);

                System.out.println("Thanks for all");
                System.out.println("Thanks for all2");
                System.out.println("Thanks for all2");


        }


}
/*
TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy
 */
