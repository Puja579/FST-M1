package Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
 
public class ProjectActivity3 {
 
	 WebDriver driver;
 
	    @BeforeClass
	    public void beforeClass() {
	        driver = new FirefoxDriver();
 
	        // Open browser
	        driver.get("http://alchemy.hguy.co/orangehrm");
	        driver.manage().window().maximize();
	    }
 
	    @Test
	    public void loginTest() {
	        // Find the username and password fields
	       WebElement username = driver.findElement(By.id("txtUsername"));
	       WebElement password = driver.findElement(By.id("txtPassword"));
 
	        // Enter credentials
	        username.sendKeys("orange");
	        password.sendKeys("orangepassword123");
 
	        // Click login
	        driver.findElement(By.className("button")).click();
 
	        // Read login message
	       String homeMessage = driver.findElement(By.className("panelTrigger")).getText();
	       System.out.println(homeMessage);
	       Assert.assertEquals("Welcome Michael", homeMessage);
	    }
 
	    @AfterClass
	   public void afterClass() {
	        // Close browser
	    driver.close();
		 	
		  
	}
 
}