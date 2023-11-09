package com.metricstream.ootb.grcLibrary.exceptionTestCase;

import com.UtilityPkg.common.LoginPageTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoneAssetApproveWorkFlowTestCase extends LoginPageTestCase {

    @Test
    public void loneApprovalWf() throws InterruptedException {

        WebDriver driver = ApprovalLogicLone();
        //JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(10000);
        WebElement taskList = driver.findElement(By.xpath("//a[@class='my-tasks-menu  msi-tooltip']"));
        taskList.click();
        Thread.sleep(10000);
        WebElement clickFirstTask = driver.findElement(By.xpath("(//a[@tabindex='-1'])[1]"));
        clickFirstTask.click();
        Thread.sleep(20000);
        WebElement clickOnSubmitToApprove = driver.findElement(By.xpath("//button[@id='btn-submit']"));
        clickOnSubmitToApprove.click();
        Thread.sleep(8000);
        WebElement clickToApproveTask = driver.findElement(By.xpath("//a[@aria-label='Approve']"));
        clickToApproveTask.click();
        Thread.sleep(8000);
        WebElement clickSubmit = driver.findElement(By.id("submit"));
        clickSubmit.click();
        Thread.sleep(8000);
        driver.close();
    }
}
