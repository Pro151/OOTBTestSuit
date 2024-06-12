package com.UtilityPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ConfigClassTestCase {
    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;


    public WebDriver configMethod(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://golubqaupg.a03a.metricstream.com");
        //driver.get("https://vodacomuat.a04b.metricstream.com/metricstream/auth/dualLogin.jsp");//https://golubqaupg.a03a.metricstream.com
        //driver.get("https://psdocenecqasrv.rnd.metricstream.com/metricstream/auth/signin.jsp");
        driver.manage().window().maximize();

        /*ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-report.html");
        htmlReporter.config().setDocumentTitle("Automation Test Report");
        htmlReporter.config().setReportName("Functional Test Report");
        htmlReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
*/
        return driver;
    }

    public void HelperMethod(){



    }

}
