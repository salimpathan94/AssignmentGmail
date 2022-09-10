package com.assignment.testCases;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.pageObjects.SignINEmailPage;


public class SignInEmailPageTest extends Baseclass {
	
	
	SignINEmailPage sp;
	
	public SignInEmailPageTest() throws Exception{
		super();
	}
	
	
	
	
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		 sp = new SignINEmailPage(driver);
		
	}
	
	@Test
	public void signInEmailPageTest() throws Exception{
		
		   driver.get(Baseurl);
		   Reporter.log("Url Entered Successfully");
		   logger.info("Url Entered Successfully");
		
             sp.setEmail(username);
             sp.clickNext();
             Thread.sleep(3000);
             
          
             if(driver.getTitle().equals("Sign in - Google Accounts")) {
     			Assert.assertTrue(true);
     			System.out.println("Email Entered Successfully");
     			Reporter.log("Email Entered Successfully");
     			logger.info("Email Entered Successfully");
     			
     		}
     		else{
     			Assert.assertTrue(false);
     			System.out.println("Worng Email Enetered");
     			Reporter.log("Wrong Email Entered");
     			logger.info("Wrong Email Entered");
     			
     		}
     
            
		
	}

      @AfterMethod
	 public void tearDown() {
    	 
    	 driver.quit();
    	 System.out.println("Application Closed Successfully");
         Reporter.log("Application Closed Successfully");
        logger.info("Application Closed Successfully");
     }    
 

	

}
