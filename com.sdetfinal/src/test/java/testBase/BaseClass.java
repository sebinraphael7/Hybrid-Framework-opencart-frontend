package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; //logging package

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	public Logger logger; // for logging
	
	@BeforeClass
	public void setup() 
	{
		logger= LogManager.getLogger(this.getClass());  //logging
		
//		ChromeOptions options =new ChromeOptions();
//		options.setExperimentalOption("excludeSwitches",new String[] {"enable automation"});
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	public String randomeString()
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return generatedString1;
	}
	public String randomeNumber()
	{
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return generatedString2;
	}
	public String randomeAlphaNumeric()
	{
		String st=RandomStringUtils.randomAlphabetic(4);
		String num=RandomStringUtils.randomNumeric(3);
		return(st+"@"+num);
	}
}
