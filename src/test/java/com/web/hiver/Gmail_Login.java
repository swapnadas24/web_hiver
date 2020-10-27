package com.web.hiver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Gmail_Login extends Lunch_Browser{
	
	@Test
	public void gmail_Login() {
		
		//Enter email_id
		WebElement email=driver.findElement(By.id(prop.getProperty("email_id")));
		email.sendKeys(prop.getProperty("Enter_EmailId"));
		email.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.className(prop.getProperty("click_Next"))).click();
		
		//Enter password
		driver.findElement(By.name(prop.getProperty("password_id"))).sendKeys(prop.getProperty("Enter_Password"));
		driver.findElement(By.className(prop.getProperty("click_Login"))).click();
		
		
	}
	

}
