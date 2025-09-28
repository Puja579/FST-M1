package Project;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterClass;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	 
	public class ProjectActivity5 {
	 
	    WebDriver driver;
	 
	    @BeforeClass
	    public void beforeClass() {
	        driver = new FirefoxDriver();
	 
	        // Open browser
	        driver.get("http://alchemy.hguy.co/orangehrm");
	        driver.manage().window().maximize();
	    }
	 
	    @Test
	    public void editUserInfo() throws InterruptedException {
	        // Step 1: Login
	        WebElement username = driver.findElement(By.id("txtUsername"));
	        WebElement password = driver.findElement(By.id("txtPassword"));
	 
	        username.sendKeys("orange");
	        password.sendKeys("orangepassword123");
	        driver.findElement(By.className("button")).click();
	 
	        // Step 2: Click on My Info
	        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	        Thread.sleep(2000);
	 
	        // Step 3: Click Edit
	        driver.findElement(By.id("btnSave")).click();
	 
	        // Step 4: Update First and Last Name
	        WebElement firstName = driver.findElement(By.id("personal_txtEmpFirstName"));
	        WebElement lastName = driver.findElement(By.id("personal_txtEmpLastName"));
	 
	        firstName.clear();
	        firstName.sendKeys("John");
	        lastName.clear();
	        lastName.sendKeys("Doe");
	 
	        // Step 5: Set Gender
	        driver.findElement(By.id("personal_optGender_1")).click(); // Male
	 
	        // Step 6: Set Nationality
	        WebElement nationality = driver.findElement(By.id("personal_cmbNation"));
	        nationality.sendKeys("Indian");
	 
	        // Step 7: Set Date of Birth
	        WebElement dob = driver.findElement(By.id("personal_DOB"));
	        dob.clear();
	        dob.sendKeys("1993-08-15");
	 
	        // Step 8: Save changes
	        driver.findElement(By.id("btnSave")).click();
	 
	        Thread.sleep(2000);
	    }
	 
	    @AfterClass
	    public void afterClass() {
	        // Close the browser
	        driver.close();
	    }
	}

