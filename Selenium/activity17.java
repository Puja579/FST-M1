package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class activity17 {
	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");
        System.out.println("Page title: " + driver.getTitle());
        
        WebElement select1= driver.findElement(By.cssSelector("select.h-80"));
        Select dropdown= new Select(select1);
        
        dropdown.selectByVisibleText("HTML");
        for (int i = 3; i <= 5; i++) {
            dropdown.selectByIndex(i);
        }
        
        dropdown.selectByValue("nodejs");
        
        List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        
        dropdown.deselectByIndex(4);
        
        selectedOptions = dropdown.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        
        driver.quit();

}
}
