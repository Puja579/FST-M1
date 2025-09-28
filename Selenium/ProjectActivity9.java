package Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProjectActivity9 {

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
	        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	        driver.findElement(By.xpath("//a[@href='/orangehrm/symfony/web/index.php/pim/viewEmergencyContacts/empNumber/1']")).click();
	        
	        // Print the number of rows
	        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table hover')]/tbody/tr"));
	        System.out.println("Number of persons to contact: " + rows.size());
	        
	        // Retrieve and print all the contacts
	        for (int i=1;i<=3;i++) {
	        WebElement Contact = driver.findElement(By.xpath("//table[contains(@class, 'table hover')]/tbody/tr["+i+"]/td[5]"));
	        System.out.println("Contact "+ i +" : " + Contact.getText());
	        }
	        
       
	  }

	   @AfterClass
	   public void afterClass() {
	        // Close browser
	    driver.close();
		 	
		  
	    }

}

