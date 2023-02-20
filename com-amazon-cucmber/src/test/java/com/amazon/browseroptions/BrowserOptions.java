package com.amazon.browseroptions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ImmutableCapabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserOptions {
	WebDriver driver;
	public void setupOptions(String browserType) throws MalformedURLException {
		if(browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "");
			
			ChromeOptions options = new ChromeOptions();
			options.setBrowserVersion("latest");
			options.setCapability("platformName", "windows 10");
			Proxy proxy = new Proxy();
			proxy.setNoProxy("no_proxy-var");
			proxy.setHttpProxy("http_proxy-url:port");
			proxy.setSslProxy("https_proxy-url:port");
			options.setCapability("proxy", proxy);
			driver = new ChromeDriver(options);
			
		}
        if(browserType.equals("remote")){
        	MutableCapabilities sauceoptions = new MutableCapabilities();
        	sauceoptions.setCapability("build", "java-W3C-Examples");
        	sauceoptions.setCapability("name", "testing top rated and ram size");
        	DesiredCapabilities cap =  new DesiredCapabilities();
        	cap.setCapability("browserName", "chrome");
        	cap.setCapability("browserVersion", "latest");
        	cap.setCapability("platformName", "windows 10");
        	cap.setCapability("sauce:options", sauceoptions);
        	URL  remoteUrl =  new URL("https://oauth-praveenkk8693-73b97:6b5850da-7784-43fb-b196-063e168bc514@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        	
			driver =  new RemoteWebDriver(remoteUrl,cap);
			
		}
	}

}
