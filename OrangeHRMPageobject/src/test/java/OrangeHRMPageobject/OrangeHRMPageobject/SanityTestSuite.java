package OrangeHRMPageobject.OrangeHRMPageobject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class SanityTestSuite {
	
	
	static WebDriver driver;
	
	@BeforeClass
	public static void before()
	
	{
		
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
	//driver=new ChromeDriver();
	driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().window().maximize();
			
	}
	
	@AfterClass
	public static void after()
	{
	driver.quit();
	driver=null;	
		
	}		
		
	@Test
	public void userCanLoginValidDetails()
	
	{
	//user can login with valid details
	driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	
	Assert.assertEquals(driver.findElement(By.id("welcome")).getText(),"Welcome Admin");
	
	}

}
