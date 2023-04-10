package com.base;

import java.util.List;
import java.io.File;
import java.util.LinkedList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
	}
	
	public static void generateJVMreport(String json) {
		
		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\reports\\JVUMReports");
		
		//Configuration - give some details about projects
		Configuration con=new Configuration(loc, "Calculator");
		con.addClassifications("browser name", "chrome");
		con.addClassifications("version ", "106");
		con.addClassifications("os name", "windows 10");
		con.addClassifications("environment", "QA");
		
		List<String> jsonFiles=new LinkedList<String>();
		jsonFiles.add(json);
		ReportBuilder r=new ReportBuilder(jsonFiles, con);
        r.generateReports();
        
	}
}


