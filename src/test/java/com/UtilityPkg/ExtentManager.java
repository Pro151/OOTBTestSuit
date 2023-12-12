package com.UtilityPkg;

import com.aventstack.extentreports.ExtentReports;
public class ExtentManager {

    private static ExtentReports extent;

    public static <ExtentHtmlReporter> ExtentReports createInstance() {
        if (extent == null) {
           // extent = new ExtentReports();
            //ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
            //extent.attachReporter(htmlReporter);
        }
        return extent;
    }
}
