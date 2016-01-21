package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.*;

public class Reporting {
  
@Test
  public void verifyTitle() {
		ExtentReports logger = ExtentReports.get(Reporting.class);
		logger.init("D:\\JavaWorkplaceProjects\\report.html",true);

	    logger.startTest("Verify Page Title");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO,"Browser is up and running");
		driver.get("http://learn-automation.com");
		logger.log(LogStatus.INFO,"Application is up and running");
		String title = driver.getTitle();
		logger.log(LogStatus.INFO,"Title captured");
		Assert.assertTrue(title.contains("Selenium"));
		
		logger.log(LogStatus.PASS,"Title is verified");
		logger.attachScreenshot("C:\\Users\\Olena_Hurkovska\\Pictures\\extent2-snapshot.png");
		driver.quit();
		logger.endTest();
  }
}
