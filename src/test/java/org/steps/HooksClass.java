package org.steps;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	
	@Before (order=1)
	public void startingBrowser() {
		System.out.println("\n\n====================");
		System.out.println("Browser Launch From Hooks");
		browserLaunch();

	}
	
	@Before (order=2)
	public void maxWin() {
		
		System.out.println("Max Window From Hooks");
//driver.manage().window().maximize();
	}
	@Before (order=3,value="@Smoke")
	public void implicitWait() {
		
		System.out.println("Implicit wait From Hooks");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Before (order=4,value="@Sanity")
	public void pageLogin() {
		
		System.out.println("Login Page From Hooks");

	}
	
		
	@After
	public void screenShot(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");
			
			
		}
		

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
