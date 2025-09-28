package Project;


	import java.time.Duration;
	 
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.AssertJUnit;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	 
	public class ProjectActivity8 {
	    WebDriver driver;
	    WebDriverWait wait;
	 
	    @BeforeClass
	    public void beforeClass() throws Exception {
	        driver = new FirefoxDriver();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	        // Step a: Open OrangeHRM page
	        driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
	        Thread.sleep(1000);
	 
	        // Login
	        driver.findElement(By.id("txtUsername")).sendKeys("orange");
	        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	        driver.findElement(By.id("btnLogin")).click();
	        Thread.sleep(1000);
	    }
	 
	    @Test
	    public void applyLeaveTest() throws Exception {
	        // Step b: Navigate to Dashboard and click Apply Leave
	        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.id("menu_leave_applyLeave")).click();
	        Thread.sleep(1000);
	 
	        // Step c: Select leave type and duration
	        Select leaveType = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
	        leaveType.selectByVisibleText("DayOff"); // example leave type
	        Thread.sleep(1000);
	 
	        WebElement fromDate = driver.findElement(By.id("applyleave_txtFromDate"));
	        WebElement toDate = driver.findElement(By.id("applyleave_txtToDate"));
	        fromDate.clear();
	        fromDate.sendKeys("2025-10-01");
	        toDate.clear();
	        toDate.sendKeys("2025-10-01");
	        Thread.sleep(1000);
	 
	        // Step d: Click Apply
	        driver.findElement(By.id("applyBtn")).click();
	        Thread.sleep(1000);
	 
	        // Step e: Navigate to My Leave to check status
	        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
	        Thread.sleep(1000);
	 
	        // Step f: Success message (following previous style)
	        String message = driver.findElement(By.id("action-confirmation")).getText();
	        AssertJUnit.assertEquals("Your event has been scheduled!", message);
	        System.out.println(" Leave applied successfully!");
	    }
	 
	 
	    @AfterClass
	    public void afterClass() throws Exception {
	       
	    }
	}


