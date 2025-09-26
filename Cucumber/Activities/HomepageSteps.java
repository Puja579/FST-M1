package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomepageSteps extends BaseClass{
	@Given("the user is on the TS homepage")
	public void openHoempage() {
	driver.get("https://training-support.net");
	assertEquals(driver.getTitle(), "Training Support");
	}
	@When("they click on the About Us link")
	public void clickAboutLink(){
		driver.findElement(By.linkText("About Us")).click();
	}
 
	@Then("they are redirected to the About Us page")
	public void VerifyAboutPage() {
		wait.until(ExpectedConditions.titleIs("About Training Support"));
		String pageHeading = driver.findElement(By.cssSelector("h1.text-center")).getText();
 
		System.out.println("New page title is: " + pageHeading);
		assertEquals(pageHeading, "About Us");

}
}