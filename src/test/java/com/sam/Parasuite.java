package com.sam;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parasuite {
	WebDriver driver; 
	@BeforeClass
	private void before() {
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
			}
	
@BeforeMethod
private void beforemethod() {
	Date date=new Date();
	System.out.println(date);

}
@Parameters({"mail","password"})
@Test
private void test(String s,String s1) {
	WebElement txtuser = driver.findElement(By.id("email"));
	txtuser.sendKeys(s);
	Assert.assertEquals(s, txtuser.getAttribute("value"));
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys(s1);
	Assert.assertEquals(s1, txtpass.getAttribute("value"));
	
}
@Test
private void test1() {
	driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	
}
@AfterMethod
private void aftermethod() {
	Date date =new Date();
	System.out.println(date);

}
@AfterClass
private void afterclass() {
	driver.quit();

}

}


