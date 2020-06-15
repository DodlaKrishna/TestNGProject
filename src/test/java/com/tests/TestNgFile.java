package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgFile {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority=1)
	public void loginPage() {
		System.out.println("Login the page");
	}
	
	@Test(priority=2)
	public void searchPage() {
		System.out.println("search the page");
	}
	
	@Test(priority=4)
	public void windowPage() {
		System.out.println("window the page");
	}
	
	@Test(priority=5)
	public void rscPage() {
		System.out.println("RSC the page");
	}
	
	@Test(priority=3)
	public void rppPage() {
		System.out.println("RPP the page");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
