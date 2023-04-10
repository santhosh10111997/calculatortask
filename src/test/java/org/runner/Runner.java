package org.runner;


import com.base.JvmReport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\pavithra\\eclipse-workspace\\Calcul\\src\\test\\resources\\features\\login.features",
glue="org.stepdefinitions",
dryRun=false, monochrome=true,
plugin= {"pretty",
		 "html:src\\test\\resources\\reports\\htmlreports",
		 "json:src\\test\\resources\\reports\\jsonReports\\jsonreport.json",
		 "junit:src\\test\\resources\\reports\\junitReport\\report.xml"})
public class Runner {
	@BeforeClass
	public static void before() {
		

	}
	@AfterClass
	public static void report() {
		JvmReport.generateJVMreport("src\\test\\resources\\reports\\jsonReports\\jsonreport.json");
	
System.out.println("......done.........");
	}
	
}
