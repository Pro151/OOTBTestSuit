package com.metricstream.ootb.grcLibrary.aocTestCase;

import com.UtilityPkg.common.GrcLibraryTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormFillingTestCase extends GrcLibraryTestCase {

    @Test
    public void aocFormFill() throws InterruptedException {
        //Fill general section
        WebDriver driver =GRCTestMethod();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Fill name field
        Thread.sleep(12000);
        WebElement clickAocForm = driver.findElement(By.xpath("//div[@class='infocenter-action-button dropdown open']//div[@class='dropdown-menu page-header-menu link-infoport']//div//a[@title='Area of Compliance'][normalize-space()='Area of Compliance']"));
        clickAocForm.click();
        Thread.sleep(7000);
        WebElement saveFormWithoutData = driver.findElement(By.xpath("//button[@id='btn-save']"));
        saveFormWithoutData.click();
        Thread.sleep(4000);
        WebElement closeForm = driver.findElement(By.xpath("//button[@id='btn-cancel']"));
        closeForm.click();
        Thread.sleep(7000);
        WebElement taskList = driver.findElement(By.xpath("//a[@class='my-tasks-menu  msi-tooltip']"));
        taskList.click();
        Thread.sleep(9000);
        WebElement clickFirstTask = driver.findElement(By.xpath("(//a[@tabindex='-1'])[1]"));
        clickFirstTask.click();
        Thread.sleep(11000);
        WebElement name = driver.findElement(By.xpath("//input[@aria-label='Name']"));
        name.sendKeys("Auto_Test_10th_Oct_new");
        Thread.sleep(2000);
        //Fill types lov
        //new Select(driver.findElement(By.xpath("//input[@aria-label='Type to Search']"))).selectByVisibleText("Environmental");
        //select lov
        //new Select(driver.findElement(By.xpath("//input[@aria-label='Type to Search']"))).selectByVisibleText("Corporate");
        WebElement type = driver.findElement(By.xpath("//input[@aria-label='Type to Search']"));
        type.click();
        Thread.sleep(5000);

        //lov value picker random
        for(int i=1;i<=7;i++) {
            WebElement typeSelect = driver.findElement(By.xpath("(//div[@class='select2-result-label'])["+i+"]"));
            typeSelect.click();

        }
        //Fill validity section
        //Fil start date
        WebElement strtDate = driver.findElement(By.xpath("//input[@placeholder='Valid From']"));
        strtDate.sendKeys("02/10/2023");
        Thread.sleep(1000);
        //WebElement dateStrtSelect = driver.findElement(By.xpath("(//a[@class='btn btn-default btn-select-calendar'])[1]"));
        //dateStrtSelect.click();
        //fill end date
        WebElement endDate = driver.findElement(By.xpath("//input[@placeholder='Valid Until']"));
        endDate.sendKeys("02/11/2023");
        Thread.sleep(1000);
        //WebElement endDateSelect = driver.findElement(By.xpath("(//a[@class='btn btn-default btn-select-calendar'])[2]"));
        //endDateSelect.click();
        WebElement clickOutside = driver.findElement(By.xpath("(//section[@role='region'])[1]"));
        clickOutside.click();
        //js.executeScript("window.scrollBy(0,3000);");
        WebElement orgSelect = driver.findElement(By.xpath("//div[@aria-label='Owner Organizations, Press to Change  required ']"));
        orgSelect.click();
        Thread.sleep(3000);
        WebElement searchOrgBox = driver.findElement(By.xpath("(//input[@placeholder='Search'])[3]"));
        searchOrgBox.sendKeys("\n" + "Vodacom South Africa");
        Thread.sleep(3000);
        WebElement elementSearchIcon = driver.findElement(By.xpath("//i[@class='icn icn-arrow-o-right']"));
        elementSearchIcon.click();
        Thread.sleep(3000);
        WebElement clickCheckBox = driver.findElement(By.xpath("//span[@role='treeitem']"));
        clickCheckBox.click();
        Thread.sleep(3000);
        WebElement clickAddOrg = driver.findElement(By.xpath("//button[text()='Add']"));
        clickAddOrg.click();
        Thread.sleep(10000);

        //for(int j=0;j<=3;j++) {
        js.executeScript("window.scrollBy(0,300);");
        //}
        Thread.sleep(2000);
        WebElement ownerSelectLookup= driver.findElement(By.xpath("//button[@title='Owners, Press to Change']"));
        js.executeScript("arguments[0].scrollIntoView();", ownerSelectLookup);
        Thread.sleep(3000);
        ownerSelectLookup.click();
        Thread.sleep(3000);
        WebElement ownerSearch = driver.findElement(By.xpath("(//input[@type='search'])[3]"));
        ownerSearch.sendKeys("ME_Test_User_1");
        Thread.sleep(4000);
        WebElement searchBtn0 = driver.findElement(By.xpath("(//i[@class='icn icn-arrow-o-right'])"));
        searchBtn0.click();
        Thread.sleep(4000);
        WebElement ownerSelection = driver.findElement(By.xpath("(//input[@tabindex='-1'])[11]"));
        ownerSelection.click();
        Thread.sleep(5000);
        WebElement clickDone0 = driver.findElement(By.id("done"));
        clickDone0.click();
        Thread.sleep(5000);
        WebElement L1Approver = driver.findElement(By.xpath("(//span[@class='select2-arrow'])[1]"));
        L1Approver.click();
        Thread.sleep(3000);
        WebElement l1approverSearch = driver.findElement(By.xpath("(//input[@type='search'])[3]"));
        l1approverSearch.sendKeys("ME_Test_User_2");
        Thread.sleep(4000);
        WebElement searchBtn1 = driver.findElement(By.xpath("(//i[@class='icn icn-arrow-o-right'])"));
        searchBtn1.click();
        Thread.sleep(4000);
        WebElement l1approverSelection = driver.findElement(By.xpath("(//input[@tabindex='-1'])[9]"));
        l1approverSelection.click();
        Thread.sleep(5000);
        WebElement clickDoneL1 = driver.findElement(By.id("done"));
        clickDoneL1.click();
        Thread.sleep(5000);
        WebElement L2Approver = driver.findElement(By.xpath("//span[@title='Level 2 Approver, Press to Change']"));
        L2Approver.click();
        Thread.sleep(5000);
        WebElement L2ApproverSearch = driver.findElement(By.xpath("(//input[@type='search'])[3]"));
        L2ApproverSearch.sendKeys("ME_Test_User_3");
        Thread.sleep(4000);
        WebElement searchBtn2 = driver.findElement(By.xpath("(//i[@class='icn icn-arrow-o-right'])"));
        searchBtn2.click();
        Thread.sleep(4000);
        WebElement L2approverSelection = driver.findElement(By.xpath("(//input[@tabindex='-1'])[9]"));
        L2approverSelection.click();
        Thread.sleep(3000);
        WebElement clickDoneL2 = driver.findElement(By.id("done"));
        clickDoneL2.click();
        Thread.sleep(6000);


        //Check relationship section for all objects

        WebElement relControl = driver.findElement(By.xpath("//a[@item='Controls']"));
        relControl.click();
        Thread.sleep(10000);
        WebElement selectControl = driver.findElement(By.xpath("(//span[@role='checkbox'])[1]"));
        selectControl.click();
        Thread.sleep(4000);
        WebElement clickDoneRelLookup = driver.findElement(By.xpath("(//button[text()='Done'])[1]"));
        clickDoneRelLookup.click();
        Thread.sleep(8000);
        //js.executeScript("window.scrollBy(0,-900);");
        WebElement saveFormWithData = driver.findElement(By.xpath("//button[@id='btn-save']"));
        saveFormWithData.click();
        Thread.sleep(4000);
        WebElement closeFormWithData = driver.findElement(By.xpath("//button[@id='btn-cancel']"));
        closeFormWithData.click();
        Thread.sleep(7000);
        WebElement taskListwithData = driver.findElement(By.xpath("//a[@class='my-tasks-menu  msi-tooltip']"));
        taskListwithData.click();
        Thread.sleep(9000);
        WebElement clickFirstTaskWithData = driver.findElement(By.xpath("(//a[@tabindex='-1'])[1]"));
        clickFirstTaskWithData.click();
        Thread.sleep(11000);
        WebElement sendFApproval = driver.findElement(By.xpath("(//button[@data-original-title='Send for Approval'])"));
        sendFApproval.click();
        Thread.sleep(5000);
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        Thread.sleep(12000);
        driver.close();

    }


}
