package com.assignment.testCases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.pageObjects.SignINEmailPage;

public class SetResolutionTest extends Baseclass {
	
	SignINEmailPage sp;
	
   public SetResolutionTest() throws Exception{
	super();
}
	
   
   
   @BeforeMethod
	public void setup() throws Exception {
		initialization();
		 sp = new SignINEmailPage(driver);
   }
	
	
	@Test
	public void setResolution() throws Exception{
		
		
		driver.get(Baseurl);
		Reporter.log("Url Entered Successfully");
		
		logger.info("Url Ebtered Successfully");
		

		
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		Reporter.log("WebPage Open as FullScreen Successfully");
		logger.info("WebPage Open as FullScreen Successfully");
		
		
	}
	
	
	
	  @AfterMethod
		 public void tearDown() {
	    	 
	    	 driver.quit();
	    	 System.out.println("Application Closed Successfully");
	         Reporter.log("Application Closed Successfully");
	        logger.info("Application Closed Successfully");
	     } 

}
