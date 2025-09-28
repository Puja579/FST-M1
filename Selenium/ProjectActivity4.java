package Project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class ProjectActivity4 {
    WebDriver driver;
    WebDriverWait wait;
 
    @BeforeClass
    public void beforeClass() throws Exception {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
        // Open browser
        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
        Thread.sleep(1000); // wait 1 sec
    }
 
    @Test
    public void addEmployeeTest() throws Exception {
        // Step a: Login
        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        Thread.sleep(1000); // wait 1 sec
 
        username.sendKeys("orange");
        password.sendKeys("orangepassword123");
        Thread.sleep(1000);
 
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(1000);
 
        // Step b: Go to PIM
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        Thread.sleep(1000);
 
        // Step c: Click Add
        driver.findElement(By.id("btnAdd")).click();
        Thread.sleep(1000);
 
        // Step d: Fill in employee details
        String firstName = "Nagababu";
        String lastName = "Chirra" + System.currentTimeMillis();
 
        driver.findElement(By.id("firstName")).sendKeys(firstName);
 
        driver.findElement(By.id("lastName")).sendKeys(lastName);
 
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(1000);
 
        // Step e: Navigate to Employee List
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        Thread.sleep(1000);
 
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
        Thread.sleep(1000);
 
        WebElement searchBox = driver.findElement(By.id("empsearch_employee_name_empName"));
        searchBox.sendKeys(firstName + " " + lastName);
        Thread.sleep(1000);
 
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(1000);
 
        // Wait for result and verify
        WebElement result = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[3]/a")));
 
        AssertJUnit.assertEquals(firstName, result.getText());
    }
 
    @AfterClass
    public void afterClass() throws Exception {
        // Step f: Close browser
        Thread.sleep(1000);
        driver.close();
    }
}
 
