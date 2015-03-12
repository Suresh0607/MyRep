package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Yahoo1 {
	
	
  @BeforeSuite
  
  public void initializeSelenium()
  {
	  System.out.println("Start Selenium");
  }
  
 @AfterSuite
  
  public void ShutDownSelenium()
  {
	  System.out.println("Stop Selenium");
  }
	
	
  @Test
  public void testReceiveMail() {
	  
	   System.out.println("Testing Receiving Mail");
	   
	   
  }
  
  @Test
  public void testSendMail() {
	  
	   System.out.println("Testing Sending Mail");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Opening Browser");
	  // Opening Browser
  }
  
  @AfterMethod
  public void AfterMethod() {
	  
	  System.out.println("Closing Browser");
	  // Opening Browser
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Connecting to DB");
	  
	  // Data base conneciton
  }

  @AfterTest
  public void AfterTest()
  {
	  System.out.println("Closing DB");
  }
  
}
