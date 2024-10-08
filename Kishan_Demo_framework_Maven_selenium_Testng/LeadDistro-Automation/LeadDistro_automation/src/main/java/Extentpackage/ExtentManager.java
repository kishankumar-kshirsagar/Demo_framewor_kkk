package Extentpackage;

import com.relevantcodes.extentreports.ExtentReports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ExtentManager {

    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter() {
        if (extent == null) {
            //Set date format
            DateFormat df = new SimpleDateFormat("dd_MMM_yyyy-HH_mm_ss");
            //Set HTML reporting file location
            String workingDir = System.getProperty("user.dir");
            extent = new ExtentReports(workingDir + "\\Reports\\Scharco_Test_Report_" + df.format(System.currentTimeMillis()) + ".html");
            extent.addSystemInfo("Environment", "Scharco QA Environment");
        }
        return extent;
    }
}

