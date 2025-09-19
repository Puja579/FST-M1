package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net");
		System.out.println("Page title: " + driver.getTitle());
		
		driver.findElement(By.linkText("About Us")).click();
		//driver.findElement(By.className("card mx-auto my-8 w-52 text-center svelte-4bhb3l")).click();
		System.out.println("New Page title is: " + driver.getTitle());
		driver.quit();
		
		
	}
}
