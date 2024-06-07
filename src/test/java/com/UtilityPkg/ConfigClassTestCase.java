package com.UtilityPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigClassTestCase {



    public WebDriver configMethod(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://golubqaupg.a03a.metricstream.com");
        //driver.get("https://vodacomuat.a04b.metricstream.com/metricstream/auth/dualLogin.jsp");//https://golubqaupg.a03a.metricstream.com
        //driver.get("https://psdocenecqasrv.rnd.metricstream.com/metricstream/auth/signin.jsp");
        driver.manage().window().maximize();

        return driver;
    }

    public void HelperMethod(){



    }

}
