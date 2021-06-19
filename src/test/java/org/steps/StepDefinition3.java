package org.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition3 {
	
	@Given("User will hit the Url of app")
	public void user_will_hit_the_Url_of_app() {
		
		System.out.println("Scenario 3");
	    System.out.println("Launch URL");
	}

	@When("User will enter the Username anD Password")
	public void user_will_enter_the_Username_anD_Password() {
	   System.out.println("Enter USer Name and Password");
	}

	@When("User will click the LogIn buttoN")
	public void user_will_click_the_LogIn_buttoN() {
	    System.out.println("Click Login");
	   
	}

	@Then("User should be displayed with Error MsG")
	public void user_should_be_displayed_with_Error_MsG() {
	    System.out.println("Verify Application");
	}

}
