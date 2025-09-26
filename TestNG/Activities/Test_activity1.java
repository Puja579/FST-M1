package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Test_activity1 {
	WebDriver driver;
	@BeforeClass
    public void setUp() {
        
        driver = new FirefoxDriver();
        driver.get("https://training-support.net");
    }
    
    @Test(priority = 1)
    public void homePageTest() {
        
        Assert.assertEquals(driver.getTitle(), "Training Support");
        
        // Find and click the About page link
        driver.findElement(By.linkText("About Us")).click();
    }
    
    @Test(priority = 2)
    public void aboutPageTest() {
        
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }
    
    
    @AfterClass
    public void tearDown() {
        
        driver.quit();
    }
}
