package Project;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity2 {
	WebDriver driver;
	@BeforeClass
    public void setUp() {
        
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
    }
	
	@Test
	public void getHeaderImageUrl() {
		WebElement headerImage= driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		String imageUrl = headerImage.getAttribute("src");
		System.out.println("Header Image URL: " +imageUrl);
		assertTrue(imageUrl.contains("logo.png") );
	}
	@AfterClass
	public void tearDown() {
        
        driver.quit();
    }
	
	

}
