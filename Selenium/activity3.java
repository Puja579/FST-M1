package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity3 {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/login-form");
		System.out.println("Home page title: " + driver.getTitle());
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		String message = driver.findElement(By.xpath("//h2[contains(@class, 'text-gray-800')]")).getText();
        System.out.println(message);
        
        String message1 = driver.findElement(By.xpath("//h1[contains(@class, 'text-6xl font-bold')]")).getText();
        System.out.println(message1);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.text-emerald-500")));
		
		System.out.println("Login Sucessfully Completed");
		
		
		driver.quit();
		
		
	}
	
}
