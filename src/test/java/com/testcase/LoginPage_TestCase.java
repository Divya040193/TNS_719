package com.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage_TestCase {

	@Test
	void testValidCredential() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Documents/Selenium%20Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("JavaByKiran | Dashboard"));
		String title=driver.getTitle();
		//System.out.println(title);
		
		Assert.assertEquals(title,"JavaByKiran | Dashboard");
	}
	
//	@Test
//	void testHeader() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("file:///C:/Users/ADMIN/Documents/Selenium%20Softwares/Offline%20Website/pages/examples/add_user.html");
//		
//	}
	
//	@Test
//	void testInValidCredential() 
//	{
//		WebDriver driver = new ChromeDriver();
//		driver.get("file:///C:/Users/ADMIN/Documents/Selenium%20Softwares/Offline%20Website/index.html");
//		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("123456");
//		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
//		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
//	}
}
