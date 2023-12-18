package com.sdetfinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sdf {
//	@Test
//	public void men()
//	{
//		System.out.println("sesesesese");
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver =new ChromeDriver();
//	driver.get("https://www.flipkart.com/");
//	}
	
	public static void main(String[] args) {
		System.out.println("ssssss");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
}
