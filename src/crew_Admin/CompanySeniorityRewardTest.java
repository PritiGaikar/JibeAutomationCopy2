package crew_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestCases.WebDriverPass;
import crew_Admin.CompanySeniorityReward;
import quality_Admin.FormTypeLibrary;





public class CompanySeniorityRewardTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	CompanySeniorityReward r =new CompanySeniorityReward();

	@Test(priority=1)
	  public void Adminm() throws Exception {
		  test=report.startTest("SeniorityRewardYearTest ");
		  r.Adminm(driver);
		  Assert.assertTrue(true);
	 	   test.log(LogStatus.PASS, "crew-->admin-->Seniority Reward Year "); 
		   }
	
  @AfterMethod 
 	public void afterMethod(ITestResult result) {
 	    if (result.getStatus() == ITestResult.FAILURE) {
 	        test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
 	    } else if (result.getStatus() == ITestResult.SKIP) {
 	        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
 	    } else {
 	        test.log(LogStatus.PASS, "Test passed");
 	    }
 	    report.endTest(test);
 	    report.flush();
 }
 @BeforeSuite 
 public void beforeSu() {
	 report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\JiBeAutomation\\Report\\CrewAdmin.html");		
 }

 }

  
  
  
  

