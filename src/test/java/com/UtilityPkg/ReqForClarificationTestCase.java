package com.UtilityPkg;

import com.UtilityPkg.common.LoginPageTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ReqForClarificationTestCase extends LoginPageTestCase {

    @Test
    public void ReqForClarify() throws InterruptedException {

        WebDriver driver = ReqFClarifyTestCase();
        //JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(10000);
        WebElement taskList = driver.findElement(By.xpath("//a[@class='my-tasks-menu  msi-tooltip']"));
        taskList.click();
        Thread.sleep(10000);
        WebElement clickFirstTask = driver.findElement(By.xpath("(//a[@tabindex='-1'])[1]"));
        clickFirstTask.click();
        Thread.sleep(20000);

        //new addition - validate comment history
        WebElement relatedReports = driver.findElement(By.xpath("//button[@data-original-title='Related Reports']"));
        relatedReports.click();
        Thread.sleep(5000);
        WebElement commentHistory = driver.findElement(By.xpath("//a[text()='Comments History']"));
        commentHistory.click();
        Thread.sleep(20000);
        //WebElement closeCommentHistory = driver.findElement(By.xpath("(//button[text()='Close'])[3]"));
        //closeCommentHistory.click();
        //WebElement closeCommentHistory = driver.findElement(By.linkText("Close"));
        //closeCommentHistory.click();
        WebElement tasksList = driver.findElement(By.xpath("//span[@class='badge-count']"));
        tasksList.click();
        Thread.sleep(3000);
        WebElement alertOk = driver.findElement(By.xpath("//button[@aria-label='OK']"));
        alertOk.click();
        Thread.sleep(5000);
        WebElement cnclickFirstTaskSecnd = driver.findElement(By.xpath("(//a[@tabindex='-1'])[1]"));
        cnclickFirstTaskSecnd.click();
        Thread.sleep(10000);
        //new addition - validate comment history

        WebElement clickOnSubmitToClarify = driver.findElement(By.xpath("//button[@id='btn-submit']"));
        clickOnSubmitToClarify.click();
        Thread.sleep(8000);
    }
}
