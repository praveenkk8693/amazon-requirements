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
	public static WebDriver driver;
	public static WebDriver setupOptions(String browserType) throws MalformedURLException {
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
			return driver = new ChromeDriver(options);
			
		}
		else{
        	MutableCapabilities sauceoptions = new MutableCapabilities();
        	sauceoptions.setCapability("build", "java-W3C-Examples");
        	sauceoptions.setCapability("name", "testing top rated and ram size");
        	DesiredCapabilities cap =  new DesiredCapabilities();
        	cap.setCapability("browserName", "chrome");
        	cap.setCapability("browserVersion", "latest");
        	cap.setCapability("platformName", "windows 10");
        	cap.setCapability("sauce:options", sauceoptions);
        	URL  remoteUrl =  new URL("https://oauth-chittiseena1521-2f60e:f5220b5c-1524-409e-aa24-f8e20f29fa3f@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        	
			return driver =  new RemoteWebDriver(remoteUrl,cap);
			
		}
	}

}
