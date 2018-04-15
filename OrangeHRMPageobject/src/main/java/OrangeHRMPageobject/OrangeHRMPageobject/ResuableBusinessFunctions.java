package OrangeHRMPageobject.OrangeHRMPageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResuableBusinessFunctions {

		
	 WebDriver driver;
	
	public ResuableBusinessFunctions(WebDriver driver)
	{
		
	
	this.driver = driver;
	
	}
	  public void Login(String username, String password)
	  {
	  
	  driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys(username);
	  driver.findElement(By.id("txtPassword")).sendKeys(password);
	  driver.findElement(By.id("btnLogin")).click(); 	  
		  
	  }
	  
	  public void Logout() throws InterruptedException
	  {
		  
		 driver.findElement(By.xpath(".//*[@id='welcome']")).click();
		// Thread.sleep(3000);
		 driver.findElement(By.linkText("Logout")).click();
	  }
	public void goToSkillsPage() throws InterruptedException
	
	{
	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	//Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='menu_admin_Qualifications']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("menu_admin_viewSkills")).click();
		
	}
	
	
	  
	 
		  
	  }
	  
	
	
	

