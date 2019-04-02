package DriverFactory;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utilities.ExcelFileutil;

public class DriverScript 
{
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest logger;
	
	
	
	public void starttest() throws FileNotFoundException
	{
		//MAIN SHEET
		ExcelFileutil excel=new ExcelFileutil();
		for (int i = 1; i <=excel.rowcount("MasterSheet"); i++) 
		{
			if(excel.getdata("Mastersheet", 1, 2).equalsIgnoreCase("y"))
			{
				String TCmodule=excel.getdata("Mastersheet", 1, 1);
				reporter=new ExtentHtmlReporter("./reports/testreport.html");
				
				extent =new ExtentReports();
				extent.attachReporter(reporter);
				logger=extent.createTest(TCmodule);
				
				int rowcount=excel.rowcount(TCmodule);
				
				
			}
		}
	}
	
	
}
