package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity13 {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");
        System.out.println("Page title: " + driver.getTitle());
        
        List<WebElement> cols= driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thread/tr/h"));
        System.out.println("Number of columns are: " + cols.size());
        
        List<WebElement> rows= driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thread/tr"));
        System.out.println("Number of columns are: " + rows.size());
        
        List<WebElement> thirdRowCells = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]/td"));
        System.out.println("Third row cell values: ");
        for(WebElement cell : thirdRowCells) {
            System.out.println(cell.getText());
        }
        
        
        System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[4]/td[4]")).getText());
        
        driver.quit();
       
}
}