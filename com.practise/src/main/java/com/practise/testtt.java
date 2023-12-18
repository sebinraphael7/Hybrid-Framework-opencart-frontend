package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testtt {
//	public static void main(String[] args) throws InterruptedException {
	@Test
	public void mm() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://react.greens-intl.ae/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Sign In']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Create an account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("anandhu");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("rexav");
		WebElement cont = driver.findElement(By.xpath("//div[@class='phonecountry']"));
		cont.click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7890789788");
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("anandurexav@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("seb123#A");
		driver.findElement(By.xpath("//input[@aria-label=\"Confirm Password\"]")).sendKeys("seb123#A");
		driver.findElement(By.xpath("//p[contains(text(),'I agree to the')]")).click();
		driver.findElement(By.xpath("//p[text()='Subscribe to our Newsletter']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Create an account']")).click();
		String word = driver.findElement(By.xpath("//p[normalize-space()='You have to agree terms and conditions to continue']")).getText();
		System.out.println(word);
		String msg="You have to agree terms and conditions to continu";
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(word, msg, "vaues are not equal");
				
		driver.quit();
		s.assertAll();
	}

}
