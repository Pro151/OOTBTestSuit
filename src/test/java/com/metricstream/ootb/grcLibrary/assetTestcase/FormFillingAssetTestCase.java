package com.metricstream.ootb.grcLibrary.assetTestcase;

import com.UtilityPkg.common.GrcLibraryTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FormFillingAssetTestCase extends GrcLibraryTestCase {


    @Test
    public void asstFormFill() throws InterruptedException {
        //Fill general section
        WebDriver driver =GRCTestMethod();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Fill name field
        Thread.sleep(12000);
        WebElement clickAssetForm = driver.findElement(By.xpath("//div[@class='infocenter-action-button dropdown open']//div[@class='dropdown-menu page-header-menu link-infoport']//div//a[@title='Asset'][normalize-space()='Asset']"));
        clickAssetForm.click();
        Thread.sleep(11000);
        WebElement name = driver.findElement(By.xpath("//input[@aria-label='Name']"));
        name.sendKeys("Auto_Test_3rd_Oct_Asset");
        Thread.sleep(2000);
        WebElement type = driver.findElement(By.xpath("//span[@aria-label='Type']"));
        type.click();
        Thread.sleep(3000);
        WebElement typeSelect = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[5]"));
        typeSelect.click();
        Thread.sleep(4000);
        WebElement bsnsCricalty = driver.findElement(By.xpath("//span[@aria-label='Business Criticality']"));
        bsnsCricalty.click();
        Thread.sleep(3000);
        WebElement bsnCricaltySelect = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[1]"));
        bsnCricaltySelect.click();
        Thread.sleep(3000);
        WebElement ciaConf = driver.findElement(By.xpath("//span[@aria-label='Confidentiality']"));
        ciaConf.click();
        Thread.sleep(3000);
        WebElement ciaConfSelect = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
        ciaConfSelect.click();
        WebElement ciaInteg = driver.findElement(By.xpath("//span[@aria-label='Integrity']"));
        ciaInteg.click();
        Thread.sleep(3000);
        WebElement ciaIntegSelect = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
        ciaIntegSelect.click();
        Thread.sleep(3000);
        WebElement ciaAvail = driver.findElement(By.xpath("//span[@aria-label='Availability']"));
        ciaAvail.click();
        Thread.sleep(3000);
        WebElement ciaAvailSelect = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
        ciaAvailSelect.click();
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,300);");

        WebElement clasRcover = driver.findElement(By.xpath("//input[@aria-describedby='RECOVERY_TIME_OBJECTIVE_desc']"));
        clasRcover.sendKeys("600");
        Thread.sleep(3000);
        WebElement clsRecoverDur = driver.findElement(By.xpath("(//span[@aria-label='Duration'])[1]"));
        clsRecoverDur.click();
        Thread.sleep(3000);
        WebElement durationOne = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
        durationOne.click();
        Thread.sleep(3000);
        WebElement clasRcoverPoint = driver.findElement(By.xpath("//input[@aria-describedby='RECOVERY_POINT_OBJECTIVE_desc']"));
        clasRcoverPoint.sendKeys("600");
        Thread.sleep(3000);
        WebElement clsRecoverDurTwo = driver.findElement(By.xpath("(//span[@aria-label='Duration'])[2]"));
        clsRecoverDurTwo.click();
        Thread.sleep(3000);
        WebElement durationTwo = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
        durationTwo.click();
        Thread.sleep(3000);
        WebElement clasRcoverWrk = driver.findElement(By.xpath("//input[@aria-describedby='WORK_RECOVERY_TIME_desc']"));
        clasRcoverWrk.sendKeys("600");
        Thread.sleep(3000);
        WebElement clsRecoverDurThr = driver.findElement(By.xpath("(//span[@aria-label='Duration'])[3]"));
        clsRecoverDurThr.click();
        Thread.sleep(3000);
        WebElement durationThree = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[3]"));
        durationThree.click();
        Thread.sleep(3000);
        WebElement clasRcoverMax = driver.findElement(By.xpath("//input[@aria-describedby='MAXIMUM_TOLERABLE_DOWNTIME_desc']"));
        clasRcoverMax.sendKeys("600");
        Thread.sleep(3000);
        WebElement clsRecoverDurFour = driver.findElement(By.xpath("(//span[@aria-label='Duration'])[4]"));
        clsRecoverDurFour.click();
        Thread.sleep(3000);
        WebElement durationFour = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[3]"));
        durationFour.click();
        Thread.sleep(3000);
        WebElement clasRcoverAct = driver.findElement(By.xpath("//input[@aria-describedby='RECOVERY_TIME_ACTUAL_desc']"));
        clasRcoverAct.sendKeys("600");
        Thread.sleep(3000);
        WebElement clsRecoverDurFive = driver.findElement(By.xpath("(//span[@aria-label='Duration'])[5]"));
        clsRecoverDurFive.click();
        Thread.sleep(3000);
        WebElement durationFive = driver.findElement(By.xpath("(//div[@class='select2-result-label'])[4]"));
        durationFive.click();
        Thread.sleep(3000);


        //Fill types lov
        //new Select(driver.findElement(By.xpath("//input[@aria-label='Type to Search']"))).selectByVisibleText("Environmental");
        //select lov
        //new Select(driver.findElement(By.xpath("//input[@aria-label='Type to Search']"))).selectByVisibleText("Corporate");
        /*WebElement type = driver.findElement(By.xpath("//input[@aria-label='Type to Search']"));
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
        WebElement selectOwner = driver.findElement(By.xpath("(//input[@aria-label='MEUSER1 MSI, Select the row'])[2]"));
        selectOwner.click();
        Thread.sleep(4000);
        WebElement clickDone = driver.findElement(By.id("done"));
        clickDone.click();
        Thread.sleep(5000);
        WebElement L1Approver = driver.findElement(By.xpath("(//span[@class='select2-arrow'])[1]"));
        L1Approver.click();
        Thread.sleep(3000);
        WebElement L1approverSelection = driver.findElement(By.xpath("(//input[@aria-label='MEUSER1 MSI, Select the row'])[2]"));
        L1approverSelection.click();
        Thread.sleep(5000);
        WebElement clickDoneL1 = driver.findElement(By.id("done"));
        clickDoneL1.click();
        Thread.sleep(5000);
        WebElement L2Approver = driver.findElement(By.xpath("//span[@title='Level 2 Approver, Press to Change']"));
        L2Approver.click();
        Thread.sleep(5000);
        WebElement L2approverSelection = driver.findElement(By.xpath("(//input[@aria-label='MEUSER1 MSI, Select the row'])[2]"));
        L2approverSelection.click();
        Thread.sleep(3000);
        WebElement clickDoneL2 = driver.findElement(By.id("done"));
        clickDoneL2.click();
        Thread.sleep(6000);
        WebElement relControl = driver.findElement(By.xpath("//a[@item='Controls']"));
        relControl.click();
        Thread.sleep(10000);
        WebElement selectControl = driver.findElement(By.xpath("(//span[@role='checkbox'])[1]"));
        selectControl.click();
        Thread.sleep(4000);
        WebElement clickDoneRelLookup = driver.findElement(By.xpath("(//button[text()='Done'])[1]"));
        clickDoneRelLookup.click();
        Thread.sleep(4000);
        //js.executeScript("window.scrollBy(0,-900);");
        WebElement sendFApproval = driver.findElement(By.xpath("(//button[@data-original-title='Send for Approval'])"));
        sendFApproval.click();
        Thread.sleep(5000);
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        Thread.sleep(12000);
        driver.quit();*/

    }


}
