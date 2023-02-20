package com.amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPageObject {
	WebDriver driver;
	public ProductDetailsPageObject(WebDriver driver) {
		this.driver=driver;
	}
	private By Ramsize = By.xpath("//span[text()='Ram Memory Installed Size']/parent::td/following-sibling::td/child::span");//12 GB
	
	public boolean validateRamSize() {
		return driver.findElement(Ramsize).getText().equals("12 GB");
	}

}
