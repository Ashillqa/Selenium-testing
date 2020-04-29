package org.example;

import static java.lang.Thread.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.SQLOutput;


public class AppTest 
{
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void seleniumExampleTest() throws InterruptedException{
        driver.manage().window().maximize();
        sleep(2000);
        driver.get("https://www.youidraw.com/apps/painter/");
        sleep(1000);

        Actions action = new Actions(driver);
        action.moveByOffset(600,250).clickAndHold().moveByOffset(125,50)
                .moveByOffset(0,187).moveByOffset(-250,0).moveByOffset(0,-187)
                .moveByOffset(125,-50).release().moveByOffset(-125,50).clickAndHold().moveByOffset(250,0).release()
                .moveByOffset(-225,50).clickAndHold().moveByOffset(75,0).moveByOffset(0,50).
                moveByOffset(-75,0).moveByOffset(0,-50).release().moveByOffset(125,0).
                clickAndHold().moveByOffset(75,0).moveByOffset(0,50).moveByOffset(-75,0).
                moveByOffset(0,-50).release().moveByOffset(0,137).clickAndHold().moveByOffset(0,-50).
                moveByOffset(-50,0).moveByOffset(0,50).release().perform();




        sleep(3000);



    }

    @After
    public void tearDown(){
        driver.close();
    }

}
