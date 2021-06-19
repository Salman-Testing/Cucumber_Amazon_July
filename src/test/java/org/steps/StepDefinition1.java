package org.steps;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition1 extends BaseClass {
	

	@Given("User will hit the URl")
	public void user_will_hit_the_URl() {
//		System.out.println("Scenario 1");
		System.out.println("URL launch");
		driver.get("https://en-gb.facebook.com/");
	}

	@When("User will enter the username and password")
	public void user_will_enter_the_and(DataTable d) {
	    
		List<Map<String, String>> mp = d.asMaps();
		
//		System.out.println("Username is "+mp.get(2).get("Username"));
//		System.out.println("Password is "+mp.get(1).get("Password"));
		
		driver.findElement(By.name("email")).sendKeys(mp.get(2).get("Username"));
		driver.findElement(By.name("pass")).sendKeys(mp.get(1).get("Password"));
		
		Assert.assertTrue(false);
		
	}

	@When("User will click the login button")
	public void user_will_click_the_login_button() {
//	  System.out.println("Click Login");
	  driver.findElement(By.name("login")).click();
	  
	}

	@Then("User should be displayed with error MSG")
	public void user_should_be_displayed_with_error_MSG() {
	    System.out.println("Updated error msg");
//	    WebElement errorText = driver.findElement(By.xpath("//div[contains(text(),'entered is incorrect')]"));
//	    String errorString = errorText.getText();
//	    Assert.assertTrue(errorString.contains("entered is incorrect"));
	}

	@Then("User should be displayed the different URL")
	public void userShouldBeDisplayedTheDifferentURL() {
	    System.out.println("Dif url");
//	    String currentUrl = driver.getCurrentUrl();
//	    Assert.assertTrue(currentUrl.contains("privacy_mutation_token"));
	    
	    
	}

	@Then("User should be displayed with Home Page")
	public void user_should_be_displayed_with_Home_Page() {
	    System.out.println("home page not displayed .............. Facebook");
//	    String currentUrl = driver.getCurrentUrl();
//	    Assert.assertTrue(currentUrl.contains("privacy_mutation_token"));
	}
	
	

}
