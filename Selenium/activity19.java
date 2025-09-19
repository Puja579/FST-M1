package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity19 {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title: " + driver.getTitle());
        
        driver.findElement(By.id("confirmation")).click();
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println(confirmAlert.getText());
        //confirmAlert.accept();	
        confirmAlert.dismiss();
        Thread.sleep(2000);
        
        System.out.println(driver.findElement(By.id("result")).getText());
       
        driver.quit();

}
}