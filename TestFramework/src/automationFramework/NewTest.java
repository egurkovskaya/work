package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;




public class NewTest {
	String url= "http://toolsqa.com/";
	WebDriver driver;
	String title;
	//private static Logger Log = Logger.getLogger(NewTest.class.getName());
	
	
	@Test(groups = {"Group1"})
	  public void f1() {
			System.out.println("Test is running...");
			
			
			System.out.println(title);
			
			System.out.println("Test has finished!");
  }
	
  @BeforeMethod
  public void beforeMethod() {
	  DOMConfigurator.configure("log4j.xml");
	  driver = new FirefoxDriver();
	 // Log.info("New driver instantiated");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
     // Log.info("Implicit wait applied on the driver for 10 seconds");
	  driver.get(url);
	 // Log.info("Web application launched");
	  title = driver.getTitle();
	 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
