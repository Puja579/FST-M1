package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity4 {
	public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	driver.get("https://training-support.net/webelements/target-practice");
	System.out.println("Page title: " + driver.getTitle());
	
	String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(@class, 'text-orange-600')]")).getText();
	System.out.println(thirdHeaderText);	
	
	Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(@class, 'text-purple-600')]")).getCssValue("color"));
    System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
    System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());
	
    String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
    System.out.println(purpleButtonClass);
    
    String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
    System.out.println(slateButtonText);
	
		
	driver.quit();	
	}

}
