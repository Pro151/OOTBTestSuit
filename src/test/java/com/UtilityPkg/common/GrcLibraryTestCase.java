package com.UtilityPkg.common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class GrcLibraryTestCase extends LoginPageTestCase {


    public WebDriver GRCTestMethod() throws InterruptedException {



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
        Thread.sleep(4000);
        WebElement grcManageForms = driver.findElement(By.xpath("(//ul[@class='tab-pane grouplink-tab active'])[1]"));
        String extractedText = grcManageForms.getText();
        System.out.println(extractedText);

        String grcObjectList = "Area of Compliance\n" +
                "Asset\n" +
                "Asset Class\n" +
                "Control\n" +
                "Evidence\n" +
                "Exception\n" +
                "Financial Account\n" +
                "Framework Reference\n" +
                "Function\n" +
                "Objective\n" +
                "Organizational Profile\n" +
                "Process\n" +
                "Product\n" +
                "Question and Procedure\n" +
                "Reference\n" +
                "Regulatory Body\n" +
                "Requirement\n" +
                "Risk\n" +
                "Standard";

        if(grcObjectList.equalsIgnoreCase(extractedText)){

            System.out.println("GRC Objects links are getting as expected");
        }else{

            System.out.println("GRC Objects are not getting as expected");
        }
        int minLength = Math.min(grcObjectList.length(), extractedText.length());

        // Initialize a StringBuilder to store the differences
        StringBuilder differences = new StringBuilder();

        // Compare characters in both strings
        for (int i = 0; i < minLength; i++) {
            char char1 = grcObjectList.charAt(i);
            char char2 = extractedText.charAt(i);

            if (char1 != char2) {
                differences.append("Position ").append(i + 1).append(": '").append(char1).append("' vs '").append(char2).append("'\n");
            }
        }   //chnage

        // Handle any remaining characters in the longer string
        if (grcObjectList.length() > minLength) {
            for (int i = minLength; i < grcObjectList.length(); i++) {
                differences.append("Position ").append(i + 1).append(": '").append(grcObjectList.charAt(i)).append("' vs ' '\n");
            }
        } else if (extractedText.length() > minLength) {
            for (int i = minLength; i < extractedText.length(); i++) {
                differences.append("Position ").append(i + 1).append(": ' '\n").append(extractedText.charAt(i)).append("'\n");
            }
        }

        // Print the differences
        if (differences.length() > 0) {
            System.out.println("Differences found:");
            System.out.println(differences.toString());
        } else {
            System.out.println("No differences found.");
        }

        return driver;
    }

}
