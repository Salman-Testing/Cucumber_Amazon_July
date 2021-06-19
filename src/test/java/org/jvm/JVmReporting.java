package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVmReporting {
	
	public static void jvmGenerate(String json) {
		
		File f = new File("C:\\Users\\salma\\eclipse-workspace\\Cucumber-SLR\\REPORTS\\JVMRport");
		
		Configuration c = new Configuration(f, "Social Media Application");
		
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Browser", "Google Chrome, FireFox");
		c.addClassifications("Automation Tool", "Selenium");
		c.addClassifications("Programming Language", "Java");
		c.addClassifications("Framework Tool", "Cucumber");
		
		List<String> li = new ArrayList<String>();
		
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, c);
		
		r.generateReports();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
