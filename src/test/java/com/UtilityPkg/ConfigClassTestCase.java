package com.metricstream.ootb.grcLibrary.aocTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ConfigClassTestCase {


    @Test
    public WebDriver configMethod(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://vodacomuat.a04b.metricstream.com/metricstream/auth/dualLogin.jsp");
        driver.manage().window().maximize();

        return driver;
    }

    public void HelperMethod(){


    }

}
