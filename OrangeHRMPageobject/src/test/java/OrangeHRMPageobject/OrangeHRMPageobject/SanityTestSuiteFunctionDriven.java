package OrangeHRMPageobject.OrangeHRMPageobject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class SanityTestSuiteFunctionDriven {
	
	
	static WebDriver driver;
	static ResuableBusinessFunctions func;
	
	@BeforeClass
	public static void before()
	
	{
		
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
	//driver=new ChromeDriver();
	driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	func = new ResuableBusinessFunctions(driver);
			
	}
	
	@AfterClass
	public static void after()
	{
	driver.quit();
	driver=null;	
		
	}		
		
	@Test
	public void userCanLoginValidDetails() throws InterruptedException
	
	{
	//user can login with valid details
	func.Login("Admin", "admin");
	Assert.assertEquals(driver.findElement(By.id("welcome")).getText(),"Welcome Admin");
	Thread.sleep(3000);
	func.Logout();
	
	}


  @Test
  public void userCannotLoginInvalidDetails()
  {
  //user cannot login with invalid details
	  func.Login("Admin", "hgddsh");
  
 /* driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("6777");
	driver.findElement(By.id("btnLogin")).click();*/
	
	Assert.assertTrue(driver.findElement(By.id("spanMessage")).getText().contains("Invalid credentials"));
	
	
  } 
  
  @Test
  public void userCanAddSkills() throws InterruptedException
  {
	  
  //Login
	  func.Login("Admin", "admin");
	  Assert.assertEquals(driver.findElement(By.id("welcome")).getText(),"Welcome Admin");
	  Thread.sleep(3000);
 
  //go to skills page
  func.goToSkillsPage();
  Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Skills"));
	 
  //click on add
	  
 //add the skill
	  
	  
   //cp: in the list verify that java is in the list
  //logout   
   func.Logout();
	  
  } 
  
  
  
}
