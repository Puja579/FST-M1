package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity5 {
	public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("Page title: " + driver.getTitle());
        
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
        
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());

       
        driver.quit();
    }


}

