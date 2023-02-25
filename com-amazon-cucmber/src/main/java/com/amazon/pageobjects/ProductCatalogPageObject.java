package com.amazon.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCatalogPageObject {
	WebDriver driver;
	public ProductCatalogPageObject(WebDriver driver){
		this.driver= driver;
	}
	
	private By searchBox =  By.xpath("//input[@id='twotabsearchtextbox']");
	private By searchButton = By.xpath("//input[@id='nav-search-submit-button']");
	private By rating = By.xpath("//span[@class='a-icon-alt']");
	private By rating5= By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-micro']//i//span");
	private By productName = By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-micro']//i//span[contains(text(),'4.4')]");
	private By productName2 = By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-micro']//i//span[contains(text(),'4.4')]/parent::i/parent::a/parent::span/parent::span/parent::div/parent::div/preceding-sibling::div/child::h2/child::a/child::span");
			///parent::i/parent::a/parent::span/parent::span/parent::div/parent::div/preceding-sibling::div/child::h2");
	//div[@class='a-section a-spacing-none a-spacing-top-micro']//i//span[contains(text(),'5.0')]/parent::i/parent::a/parent::span/parent::span/parent::div/parent::div/preceding-sibling::div/child::h2
	public void entersearchAndclick() {
		driver.findElement(searchBox).sendKeys("hp laptops");
		driver.findElement(searchButton).click();
	}
	
	public void clickOn5ratedlaptop() throws InterruptedException {
		driver.findElement(productName2).click();
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(productName));
//		Thread.sleep(3000);
//		driver.findElement(productName).findElement(By.xpath("parent::i/parent::a/parent::span/parent::span/parent::div/parent::div/preceding-sibling::div/child::h2/child::a/child::span")).click();
		
//		WebElement ele = driver.findElement(productName).findElement(By.xpath("parent::i/parent::a/parent::span/parent::span/parent::div/parent::div/preceding-sibling::div/child::h2/child::a/child::span"));
//		js.executeScript("arguments[0].style.border='3px solid red'", ele);
//		Thread.sleep(3000);
//		js.executeScript("arguments[0].click()", ele);
		//List<WebElement> list = driver.findElements(productName);
		/*for(WebElement ele:list) {
			if(ele.getText().contains("5.0")) {
				driver.findElement(productName)
				break;
			}
		}*/
	}

}
