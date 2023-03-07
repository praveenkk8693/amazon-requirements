package com.amazon.stepdefs;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.browseroptions.BrowserOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Xpaths {
	
	WebDriver driver;
	
	@Given("open amazon")
	public void openingAmazon() throws MalformedURLException {
		driver = BrowserOptions.setupOptions("remote");
		driver.manage().window().maximize();
		//driver.get("https://mvnrepository.com/search?q=selenium+java");
		driver.get("https://www.amazon.com/s?k=hp+laptops&crid=2IMLZLH11ZDI3&sprefix=hp+la%2Caps%2C442&ref=nb_sb_ss_ts-doa-p_2_5");
		
		
	}
	
	@Then("print and validate xpath result")
	public void validateXpath() {
		System.out.println("printing and verifying xpaths....");
		/*
		 * 
		 //a[text()='Selenium Java Client Driver']//ancestor::*")
		  * "//a[text()='Selenium Java Client Driver']//descendant::*")
		  * "//a[text()='Selenium Java Client Driver']//child::*")
		  * "//a[text()='Selenium Java Client Driver']//parent::*")
		  * "//a[text()='Selenium Java Client Driver']//following-sibling::*")
		  * "//a[text()='Selenium Java Client Driver']//preceding-sibling::*")
		  * "//a[text()='Selenium Java Client Driver']//ancestor-or-self::*")
		  */
		 
		List<WebElement> eleList =driver.findElements(By.xpath("//li[@id='p_89/HP Tuners']//parent::*"));
	System.out.println(eleList.size());
	for(WebElement ele : eleList) {
	
		System.out.println(ele.getTagName());
	}
	}
	

}
