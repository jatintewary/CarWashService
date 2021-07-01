package com.justdial.homepage;

import com.aventstack.extentreports.ExtentReports;


public class ExtentReportManager {

	public static ExtentReports report;
	
	public static ExtentReports getReportInstance(){
		
		if(report == null){
			report =  new ExtentReports();
			//report.attachReporter(Reporter1);
			report.setSystemInfo("OS", "Windows 10");
			report.setSystemInfo("Environment", "UAT");
			report.setSystemInfo("Build Number", "10.8.1");
			report.setSystemInfo("Browser", "Chrome");
		}
		
		return report;
	}
}
