package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Test_activity3 {
	WebDriver driver;
	WebDriverWait wait;
	//wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	 
    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();    
        driver.get("https://training-support.net/webelements/login-form");
    }
 
    @Test
    public void loginTest() {
        
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
 
        // Enter credentials
        username.sendKeys("admin");
        password.sendKeys("password");
 
        // Click login
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
 
        // Read login message
        String loginMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
        Assert.assertEquals("Welcome Back, Admin!", loginMessage);
    }
 
    @AfterClass
    public void afterClass() {
        // Close browser
        driver.close();
    }
}
