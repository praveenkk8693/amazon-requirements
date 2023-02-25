package com.amazon.stepdefs;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.credentials.LoginCredentials;
import com.amazon.pageobjects.LandingAndLoginPageObject;
import com.amazon.pageobjects.ProductCatalogPageObject;
import com.amazon.pageobjects.ProductDetailsPageObject;
import com.amazon.utils.CommonProperties;
import com.amazon.utils.DataInExcel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateRamSizeStepdef {
	
	WebDriver driver;
	 LandingAndLoginPageObject  landingAndLoginPageObject;
	 ProductCatalogPageObject productCatalogPageObject;
	 ProductDetailsPageObject productDetailsPageObject;
	@Given("loginto amazon")
	public void loginto_amazon() throws IOException {
	    System.setProperty("webdriver.chrome.driver", "D:\\\\softwares\\\\chromedriver_win32_109\\\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(CommonProperties.getPropertyValue("url"));
	    landingAndLoginPageObject = new LandingAndLoginPageObject(driver);
//	    landingAndLoginPageObject.clickOnSignIn();
//	    LoginCredentials loginCredentials = DataInExcel.getCredentials();
//	    landingAndLoginPageObject.enterCredentialsAndclickLogin(loginCredentials);
	}

	@When("search hp laptops and click on {int} rated laptop")
	public void search_hp_laptops_and_click_on_rated_laptop(Integer int1) throws InterruptedException {
		productCatalogPageObject = new ProductCatalogPageObject(driver);
		productCatalogPageObject.entersearchAndclick();
		productCatalogPageObject.clickOn5ratedlaptop();
	}

	@Then("validate the ram size is diplayed or not")
	public void validate_the_ram_size_is_diplayed_or_not() {
		productDetailsPageObject = new ProductDetailsPageObject(driver);
		Assert.assertTrue(productDetailsPageObject.validateRamSize());
		
	}

}
