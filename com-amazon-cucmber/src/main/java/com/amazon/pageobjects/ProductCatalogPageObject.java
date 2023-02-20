package com.amazon.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCatalogPageObject {
	WebDriver driver;
	public ProductCatalogPageObject(WebDriver driver){
		this.driver= driver;
	}
	
	private By searchBox =  By.xpath("//span[@id='nav-search-submit-text']");
	private By searchButton = By.xpath("//input[@id='nav-search-submit-button']");
	private By rating = By.xpath("//span[@class='a-icon-alt']");
	private By rating5= By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-micro']//i//span");
	private By productName = By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-micro']//i//span[contains(text(),'5.0')]/parent::i/parent::a/parent::span/parent::span/parent::div/parent::div/preceding-sibling::div/child::h2");
	//div[@class='a-section a-spacing-none a-spacing-top-micro']//i//span[contains(text(),'5.0')]/parent::i/parent::a/parent::span/parent::span/parent::div/parent::div/preceding-sibling::div/child::h2
	public void entersearchAndclick() {
		driver.findElement(searchBox).sendKeys("hp laptops");
		driver.findElement(searchButton).click();
	}
	
	public void clickOn5ratedlaptop() {
		driver.findElement(productName).click();
		//List<WebElement> list = driver.findElements(productName);
		/*for(WebElement ele:list) {
			if(ele.getText().contains("5.0")) {
				driver.findElement(productName)
				break;
			}
		}*/
	}

}
