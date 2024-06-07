/*package com.metricstream.ootb.grcLibrary.aocTestCase;

import com.UtilityPkg.common.GrcLibraryTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FormFillingAocTestCase extends GrcLibraryTestCase {*/

    /*@Test
    public void aocFormFill() throws InterruptedException {
        WebDriver driver = GRCTestMethod();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Click on 'Area of Compliance' form
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='infocenter-action-button dropdown open']//div[@class='dropdown-menu page-header-menu link-infoport']//div//a[@title='Area of Compliance'][normalize-space()='Area of Compliance']"))).click();

        // Save form without data
        WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btn-save']")));

        // Scroll the Save button into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnSave);

        // Optionally, wait a bit to ensure the button is properly in view
        Thread.sleep(500);

        // Use JavaScript to click the Save button
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnSave);

        // Close the form
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btn-cancel']"))).click();

        // Navigate to task list and click on the first task
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='my-tasks-menu  msi-tooltip']"))).click();
        // Wait until the task link is clickable
        WebElement taskClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@tabindex='-1'])[1]")));

        // Scroll the task link into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", taskClick);

        // Optionally, wait for some condition if necessary
        // For example, wait until the task link is visible and enabled (without sleep)
        //wait.until(ExpectedConditions.visibilityOf(taskClick));
        //wait.until(ExpectedConditions.elementToBeClickable(taskClick));

        // Use JavaScript to click the task link
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", taskClick);

        // Fill out the 'Name' field
        WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Name']")));
        name.sendKeys("Auto_Test_17th_Oct_new");

        // Select 'Type'
        WebElement type = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Type to Search']")));
        type.click();
        for (int i = 1; i <= 7; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='select2-result-label'])[" + i + "]"))).click();
        }

        // Fill 'Valid From' and 'Valid Until' dates
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Valid From']"))).sendKeys("02/10/2023");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Valid Until']"))).sendKeys("02/11/2023");

        // Select 'Owner Organizations'
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Owner Organizations, Press to Change  required ']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Search'])[3]"))).sendKeys("\n" + "Vodacom South Africa");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='icn icn-arrow-o-right']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@role='treeitem']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']"))).click();

        // Scroll to and select 'Owners'
        js.executeScript("window.scrollBy(0,300);");
        WebElement ownerSelectLookup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Owners, Press to Change']")));
        js.executeScript("arguments[0].scrollIntoView();", ownerSelectLookup);
        ownerSelectLookup.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='search'])[3]"))).sendKeys("ME_Test_User_1");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class='icn icn-arrow-o-right'])"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@tabindex='-1'])[11]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("done"))).click();

        // Select 'Level 1 Approver'
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='select2-arrow'])[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='search'])[3]"))).sendKeys("ME_Test_User_2");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class='icn icn-arrow-o-right'])"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@tabindex='-1'])[9]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("done"))).click();

        // Select 'Level 2 Approver'
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='Level 2 Approver, Press to Change']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='search'])[3]"))).sendKeys("ME_Test_User_3");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class='icn icn-arrow-o-right'])"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@tabindex='-1'])[9]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("done"))).click();

        // Handle relationship section for all objects
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@item='Controls']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@role='checkbox'])[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Done'])[1]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@item='Applies to Organizations']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Search'])[3]"))).sendKeys("\n" + "Vodacom South Africa");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='icn icn-arrow-o-right']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@role='treeitem']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@item='Risks']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@role='checkbox'])[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Done'])[1]"))).click();

        // Save form with data
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-save"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-cancel"))).click();

        // Navigate to task list and handle the first task
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='my-tasks-menu  msi-tooltip']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@tabindex='-1'])[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@data-original-title='Send for Approval'])"))).click();

        // Enter comments and submit
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//textarea[@aria-label='Comments'])[3]"))).sendKeys("Send for approval from the initiator to owner");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit"))).click();

        // Close the driver
        driver.close();
    }
}*/




package com.metricstream.ootb.grcLibrary.aocTestCase;

import com.UtilityPkg.common.GrcLibraryTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormFillingAocTestCase extends GrcLibraryTestCase {

    @Test
    public void aocFormFill() throws InterruptedException {
        //Fill general section
        WebDriver driver =GRCTestMethod();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Fill name field
        Thread.sleep(12000);
        WebElement clickAocForm = driver.findElement(By.xpath("//div[@class='infocenter-action-button dropdown open']//div[@class='dropdown-menu page-header-menu link-infoport']//div//a[@title='Area of Compliance'][normalize-space()='Area of Compliance']"));
        clickAocForm.click();
        Thread.sleep(15000);
        WebElement saveFormWithoutData = driver.findElement(By.xpath("//button[@id='btn-save']"));
        saveFormWithoutData.click();

        //WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("some-id")));
        //clickableElement.click();
        Thread.sleep(4000);
        WebElement closeForm = driver.findElement(By.xpath("//button[@id='btn-cancel']"));
        closeForm.click();
        Thread.sleep(7000);
        WebElement taskList = driver.findElement(By.xpath("//a[@class='my-tasks-menu  msi-tooltip']"));
        taskList.click();
        Thread.sleep(10000);
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
        searchOrgBox.sendKeys("\n" + "Golub Capital");
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
        ownerSearch.sendKeys("dprine@golubcapital.com");
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
        l1approverSearch.sendKeys("amccoy@golubcapital.com");
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
        L2ApproverSearch.sendKeys("dalcantar@golubcapital.com");
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

        //re Ac
        WebElement relAoc = driver.findElement(By.xpath("//a[@item='Applies to Organizations']"));
        relAoc.click();
        Thread.sleep(10000);
        WebElement searchOrgBoxAc = driver.findElement(By.xpath("(//input[@placeholder='Search'])[3]"));
        searchOrgBoxAc.sendKeys("\n" + "Golub Capital");
        Thread.sleep(4000);
        WebElement elementSearchIconAc = driver.findElement(By.xpath("//i[@class='icn icn-arrow-o-right']"));
        elementSearchIconAc.click();
        Thread.sleep(3000);
        WebElement clickCheckBoxAc = driver.findElement(By.xpath("//span[@role='treeitem']"));
        clickCheckBoxAc.click();
        Thread.sleep(3000);
        WebElement clickAddOrgAc = driver.findElement(By.xpath("//button[text()='Add']"));
        clickAddOrgAc.click();
        Thread.sleep(8000);

        //re risk
        WebElement relRisk = driver.findElement(By.xpath("//a[@item='Risks']"));
        relRisk.click();
        Thread.sleep(10000);
        WebElement selectRisk = driver.findElement(By.xpath("(//span[@role='checkbox'])[1]"));
        selectRisk.click();
        Thread.sleep(4000);
        WebElement clickDoneRelLookupRisk = driver.findElement(By.xpath("(//button[text()='Done'])[1]"));
        clickDoneRelLookupRisk.click();
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
        Thread.sleep(6000);
        WebElement enterComments = driver.findElement(By.xpath("(//textarea[@aria-label='Comments'])[3]"));
        enterComments.sendKeys("Send for approval from the initiator to owner");
        Thread.sleep(7000);
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        Thread.sleep(12000);
        driver.close();

    }


}


