package com.assignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPasswordPage {
	
    WebDriver driver;
	
	public SignInPasswordPage(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
	WebElement txtPassword;
	
    @FindBy(xpath="//*[@id=\"passwordNext\"]/div/button/span")
    	WebElement btnNext;
   
	
	@FindBy(xpath="//*[@id=\"forgotPassword\"]/div/button/span")
		WebElement linkForgotPassword;
	
	@FindBy(xpath="//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[3]/div/div[1]/div/div/div[1]/div/input")
	WebElement checkbox;
	
	
	
	public void setPassword(String password) {
		
		txtPassword.sendKeys(password);
	}
	
	
	public void clickNext() {
		btnNext.click();
	}
	
	public void clickLinkForgot() {
	
		linkForgotPassword.click();
	}
	
	
}
