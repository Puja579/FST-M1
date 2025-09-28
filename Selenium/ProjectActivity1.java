package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity1 {
	WebDriver driver;
	@BeforeClass
    public void setUp() {
        
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
    }
	@Test
    public void homePageTest() {
        
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        
        driver.findElement(By.id("divLogin")).click();
    }
    
    @AfterClass
    public void tearDown() {
        
        driver.quit();
    }
}


