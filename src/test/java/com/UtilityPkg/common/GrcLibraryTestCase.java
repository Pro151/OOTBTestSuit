package com.metricstream.ootb.grcLibrary.common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class GrcLibraryTestCase extends LoginPageTestCase {

    @Test
    public WebDriver AocTestMethod() throws InterruptedException {

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
        WebElement formClickRcsa = driver.findElement(By.xpath("(//span[text()=\" Forms\"])[1]"));
        formClickRcsa.click();
        Thread.sleep(3000);
        WebElement clickAocForm = driver.findElement(By.xpath("//div[@class='infocenter-action-button dropdown open']//div[@class='dropdown-menu page-header-menu link-infoport']//div//a[@title='Area of Compliance'][normalize-space()='Area of Compliance']"));
        clickAocForm.click();
        Thread.sleep(2000);


        return driver;
    }

}
