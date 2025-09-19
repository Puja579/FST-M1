package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class activity8 {
	public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
        
        Actions builder = new Actions(driver);
        

        driver.get("https://training-support.net/webelements/mouse-events");
        
        System.out.println("Page title: " + driver.getTitle());

        
        WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));

        builder.click(cargoLock).pause(Duration.ofSeconds(2)).click(cargoToml).pause(Duration.ofSeconds(2)).build().perform();
      
        String Message = driver.findElement(By.id("result")).getText();
        System.out.println(Message);
        
        builder.doubleClick(srcButton).pause(Duration.ofSeconds(2)).contextClick(targetButton).pause(Duration.ofSeconds(2)).perform();
        builder.click(driver.findElement(By.xpath("//span[text()= 'Open']"))).pause(Duration.ofSeconds(1)).build().perform();
        
       
        Message = driver.findElement(By.id("result")).getText();
        System.out.println(Message);
        
        driver.quit();
        
        }
}