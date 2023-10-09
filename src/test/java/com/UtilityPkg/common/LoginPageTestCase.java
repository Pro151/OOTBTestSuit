package com.UtilityPkg.common;

import com.UtilityPkg.ConfigClassTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPageTestCase extends ConfigClassTestCase {


    public WebDriver LoginMethod() throws InterruptedException {

        WebDriver driver = configMethod();
        WebElement loginE = driver.findElement(By.xpath("//font[text()=\"System User Login\"]"));
        loginE.click();
        WebElement uName = driver.findElement(By.name("username"));
        uName.sendKeys("SYSTEMI");
        WebElement pWd = driver.findElement(By.name("passwordHolder"));
        pWd.sendKeys("welcome*12");
        WebElement loginBtn = driver.findElement(By.id("passwordLoginBtn"));
        loginBtn.click();
        Thread.sleep(3000);

        return driver;
    }


    public WebDriver ApprovalLogicOwner() throws InterruptedException {

        WebDriver driver = configMethod();
        WebElement loginE = driver.findElement(By.xpath("//font[text()=\"System User Login\"]"));
        loginE.click();
        WebElement uName = driver.findElement(By.name("username"));
        uName.sendKeys("ME_Test_User_1");
        WebElement pWd = driver.findElement(By.name("passwordHolder"));
        pWd.sendKeys("welcome*12");
        WebElement loginBtn = driver.findElement(By.id("passwordLoginBtn"));
        loginBtn.click();
        Thread.sleep(3000);

        return driver;


    }

    public WebDriver ApprovalLogicLone() throws InterruptedException {

        WebDriver driver = configMethod();
        WebElement loginE = driver.findElement(By.xpath("//font[text()=\"System User Login\"]"));
        loginE.click();
        WebElement uName = driver.findElement(By.name("username"));
        uName.sendKeys("ME_Test_User_2");
        WebElement pWd = driver.findElement(By.name("passwordHolder"));
        pWd.sendKeys("welcome*12");
        WebElement loginBtn = driver.findElement(By.id("passwordLoginBtn"));
        loginBtn.click();
        Thread.sleep(3000);

        return driver;


    }

    public WebDriver ApprovalLogicLtwo() throws InterruptedException {

        WebDriver driver = configMethod();
        WebElement loginE = driver.findElement(By.xpath("//font[text()=\"System User Login\"]"));
        loginE.click();
        WebElement uName = driver.findElement(By.name("username"));
        uName.sendKeys("ME_Test_User_3");
        WebElement pWd = driver.findElement(By.name("passwordHolder"));
        pWd.sendKeys("welcome*12");
        WebElement loginBtn = driver.findElement(By.id("passwordLoginBtn"));
        loginBtn.click();
        Thread.sleep(3000);

        return driver;


    }

}
