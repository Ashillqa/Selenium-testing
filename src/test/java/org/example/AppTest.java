package org.example;

import static java.lang.Thread.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class AppTest 
{
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void seleniumExampleTest() throws InterruptedException {
        driver.manage().window().maximize();
        sleep(2000);
        driver.get("http://automationpractice.com/index.php");
        sleep(1000);
        WebElement searchbar = driver.findElement(By.id("search_query_top"));
        searchbar.sendKeys("dress", Keys.ENTER);
        sleep(500);
        WebElement dress = driver.findElement(By.xpath("(//a[contains(text(),'Printed Summer Dress')])[4]"));
        dress.click();
        sleep(1000);
        WebElement buyButton =  driver.findElement(By.name("Submit"));
        buyButton.click();
        sleep(3000);
        WebElement submit1 = driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span"));
        submit1.click();
        sleep(500);
        WebElement submit2 =  driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span"));
        submit2.click();
        sleep(500);










    }




    @After
    public void tearDown(){
       // driver.close();
    }

}
