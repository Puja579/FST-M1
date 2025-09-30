package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class ProjectActivity6 {
    WebDriver driver;
    WebDriverWait wait;
 
    @BeforeClass
    public void beforeClass() throws Exception {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
        // Step a: Open OrangeHRM page
        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
        Thread.sleep(2000);
 
        // Login
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
    }
 
    @Test
    public void verifyDirectoryMenuTest() throws Exception {
        // Step b + c: Wait for Directory menu to be clickable
        WebElement directoryMenu = wait.until(
            ExpectedConditions.elementToBeClickable(By.id("menu_directory_viewDirectory"))
        );
 
        if (directoryMenu.isDisplayed()) {
            System.out.println("Directory menu is visible and clickable.");
 
            // Step d: Click
            directoryMenu.click();
            Thread.sleep(2000);
 
            // Step e: Verify heading
            WebElement heading = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Directory')]"))
            );
            String pageHeading = heading.getText();
 
            if (pageHeading.equals("Search Directory")) {
                System.out.println("Page heading verified: " + pageHeading);
            } else {
                System.out.println("Page heading mismatch! Found: " + pageHeading);
            }
        } else {
            System.out.println("Directory menu not visible!");
        }
    }
 
    @AfterClass
    public void afterClass() throws Exception {
        Thread.sleep(1000);
        driver.quit();
        System.out.println("Browser closed successfully.");
    }
}
 
