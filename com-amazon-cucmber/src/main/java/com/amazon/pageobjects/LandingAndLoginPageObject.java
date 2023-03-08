package com.amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LandingAndLoginPageObject {
	WebDriver driver;
	 public LandingAndLoginPageObject(WebDriver driver){
		this.driver=driver;
	}
	
	private By signIn = By.xpath("//a[@id='nav-link-accountList']");
	private By emailbox = By.xpath("//input[@id='ap_email']");
	private By continueButton = By.xpath("//input[@id='continue']");
	private By passwordbox = By.xpath("//input[@id='ap_password']");
	private By signButton = By.xpath("//input[@id='signInSubmit']");
	
	public void clickOnSignIn() {
		driver.findElement(signIn).click();
	}
	
//	public void enterCredentialsAndclickLogin(LoginCredentials loginCredentials) {
//		
//		driver.findElement(emailbox).sendKeys(loginCredentials.getUserName());
//		driver.findElement(continueButton).click();
//		driver.findElement(passwordbox).sendKeys(loginCredentials.getPassword());
//		driver.findElement(signButton).click();
//	}
	
			

}
