package BasePackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	// This code is used to run the skip, failed test case at least thrice and then conclude report.

    private int count = 0;
    private static int maxTry = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {                      
            if (count < maxTry) {                            
                count++;                                    
                iTestResult.setStatus(ITestResult.FAILURE); 
                return true;                                
            } else {
                iTestResult.setStatus(ITestResult.FAILURE);  
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);   
        }
        return false;
    }
}