package Ritikk;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class apps {
	private static final int priority = 0;
	WebDriver driver;
	@BeforeTest
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}
	@AfterTest
	public void teardown() throws Exception {
	Thread.sleep(2000);
	driver.close();
	}
	@Test(priority=0)
	public void App_Title() {
		//String actualAppTitle = driver.getTitle();
		//String expectedTitle = "Amazon.in : Amazon.in";
		//Assert.assertEquals(actualAppTitle, expectedTitle);
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		driver.findElement(By.tagName("button")).click();
		
	}
	
	@Test(priority=1)
	public void login() {
		driver.findElement(By.xpath("//p[text()[normalize-space()='Customers']]")).click();
	}
	
	@Test(priority=2)
	public void customer() {
		driver.findElement(By.xpath("html[1]/body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]")).click();
		driver.findElement(By.xpath("//p[text()=' Customers']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	}
	
	
	
	
	
	//@Test
	//public void searchiTem() throws Exception {
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("motorola");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//File targetLocation = new File("C:\\Users\\DELL\\eclipse-workspace\\Com.org.coforge_training-selenium\\Screenshot./AmazonTest_iphone.png");
		//FileUtils.copyFile(screenshotFile, targetLocation);

	}
	
	
	
	

