package org.runner;



import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JVmReporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith (Cucumber.class)
@CucumberOptions (features="src/test/resources", glue="org.steps",
dryRun=false,  monochrome=true, strict=true,
plugin= {"html:C:\\Users\\salma\\eclipse-workspace\\Cucumber-SLR\\REPORTS\\HTMLNEWReport",
		"json:C:\\Users\\salma\\eclipse-workspace\\Cucumber-SLR\\REPORTS\\JSONReport\\JsonGenerate.json",
		"junit:C:\\Users\\salma\\eclipse-workspace\\Cucumber-SLR\\REPORTS\\JUNITReport\\JunitGenerate.xml",
		"rerun:C:\\Users\\salma\\eclipse-workspace\\Cucumber-SLR\\failedScenarios\\failed.txt"})
public class RunnerClass {
	
	
	@AfterClass
	public static void jvm() {
		JVmReporting.jvmGenerate("C:\\\\Users\\\\salma\\\\eclipse-workspace\\\\Cucumber-SLR\\\\REPORTS\\\\JSONReport\\\\JsonGenerate.json");

	}

}
