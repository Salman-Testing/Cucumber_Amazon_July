package org.steps;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass{
	

	@Given("User will hit the url of app")
	public void user_will_hit_the_url_of_app() {
		driver.get("https://en-gb.facebook.com/");
	}


	@When("User will enter the Username and Password")
	public void user_will_enter_the_Username_and_Password() {
		driver.findElement(By.name("email")).sendKeys("Selenium");
		driver.findElement(By.name("pass")).sendKeys("Selenium@1234");
		Assert.assertTrue(false);
		
	}

	@When("User will click the LogIn button")
	public void user_will_click_the_LogIn_button() {
	    System.out.println("Click Login");
	}

	@Then("User should be displayed with Error MSG")
	public void user_should_be_displayed_with_Error_MSG() {
	   System.out.println("Verify Login ............... Instagram");
	   
	}

}
