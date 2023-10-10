package com.UtilityPkg.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportValidationTestCase extends LoginPageTestCase{

    public void reportValidationTest() throws InterruptedException {

        WebDriver driver = LoginMethod();
        Thread.sleep(9000);
        WebElement settingsClick = driver.findElement(By.xpath("//a[@data-title=\"Settings\"]"));
        settingsClick.click();
        Thread.sleep(1000);
        WebElement grcInfocenter = driver.findElement(By.xpath("//a[@title='GRC Libraries']"));
        grcInfocenter.click();

        Thread.sleep(1000);
        WebElement manegeInfocenter = driver.findElement(By.xpath("//a[@aria-label='Manage']"));
        manegeInfocenter.click();
        Thread.sleep(4000);
        WebElement reportSection = driver.findElement(By.xpath("(//span[text()=\" Reports\"])[1]"));
        reportSection.click();
        Thread.sleep(4000);

    }
}
