package test;

import org.testng.Assert;
//import org.testng.SkipException;
import org.testng.annotations.Test;

public class Yahoo {
  @Test
  public void YahooNewsTest() {
	    
	 // throw new SkipException("Skipping the test because of Some");
	  
	  System.out.println("YahooNewsTest");
	  
	 // Assert.assertEquals("Good", "dGood");
	  
	  System.out.println("Before Assertion");
	  Assert.assertTrue(6>1, "Error Message");
	  try{
	  Assert.assertFalse(1>9, "");
	  }catch(Throwable e)
	  {
		 System.out.println("Caught the error");
	  }
	  System.out.println("After Assertion");
	  
	  
	  
  }
}
