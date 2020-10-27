package com.web.hiver;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.web.hiver.base.Testbase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lunch_Browser extends Testbase
{
	ChromeOptions options;
    WebDriver driver;
    
    @BeforeTest
    public void lunchChrome(){
    	
        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();
        
		// To stop unwanted pop-up of chrome browser
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--start-maximized");
    }
	@BeforeClass
	public void lunch(){

		driver = new ChromeDriver(options);		
	}
	
	@BeforeMethod
	public void gmail_lunch() throws InterruptedException {
		 driver.get(prop.getProperty("gmail_URL"));
		 Thread.sleep(500);
		 
	}
	@AfterClass
	public void getText() {
		
	}

	@AfterTest
	public void quit() {
		//driver.quit();

	} 
    
}
