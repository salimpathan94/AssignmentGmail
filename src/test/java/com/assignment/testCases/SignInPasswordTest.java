package com.assignment.testCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.pageObjects.SignINEmailPage;
import com.assignment.pageObjects.SignInPasswordPage;

public class SignInPasswordTest extends Baseclass {
	
	 SignINEmailPage sp;
	 SignInPasswordPage sp1;
	 
	 public SignInPasswordTest() {
		  super();
	 }
	 
	 
	 
	 @BeforeMethod
		public void setup() throws Exception {
			initialization();
			 sp = new SignINEmailPage(driver);
			
		}
	 
	 
	@Test
	public void signInLoginPasswordTest() throws Exception {
		
		
		driver.get(Baseurl);
		Reporter.log("Url Entered Successfully");
		//Log.info("Url Entered Successfully");
	
        sp.setEmail(username);
        
         sp.clickNext();
         Thread.sleep(3000);
         
        System.out.println("email Enetered successfully");
        Reporter.log("Email Entered Successfully");
         logger.info("Email Entered Successfully");
		
        
         sp1= new SignInPasswordPage(driver);
       
        sp1.setPassword(password);
        
        sp1.clickNext();
        Thread.sleep(3000);
        
        if(driver.getTitle().equals("Gmail")) {
 			Assert.assertTrue(true);
 			System.out.println("Login  Successfully");
 			Reporter.log("Login Successfully");
 			logger.info("Login Successfully");
 			
 		}
 		else{
 			Assert.assertTrue(false);
 			System.out.println("Worng Password Enetered");
 			Reporter.log("Wrong Password Entered");
            logger.info("Wrong Password Entered");
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
