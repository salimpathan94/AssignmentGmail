package com.assignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment.testCases.Baseclass;

public class SignINEmailPage extends Baseclass {

	
   WebDriver driver;
	
	public SignINEmailPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
}
	
	
	@FindBy(xpath="//*[@id=\"identifierId\"]")
	WebElement txtEmail;
	
	
	@FindBy(xpath= "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")
	WebElement linkForgotEmail;
	
	@FindBy(xpath= "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/span/div/div/a")
	WebElement linkLearnmore;
	
	@FindBy(xpath= "//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")
	WebElement linkCreateaccount;
	
	
	@FindBy(xpath="//*[@id=\"identifierNext\"]/div/button/span")
	WebElement btnNext;
	
	
	
	public void setEmail(String em) {
		txtEmail.sendKeys(em);
	}
	
	public void clickNext() {
		btnNext.click();
	} 
	
	public void clickCreateaccount() {
		 linkCreateaccount.click();
		 
		 
		 
		 
		
	}
	
	
}