package pages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BasePage 
{
	private 
	static ExtentSparkReporter esr;
	public static ExtentReports er;
	public static ExtentTest et;
	public static ExtentTest ts;
	
	@BeforeSuite
	public void bs()
	{
		esr=new ExtentSparkReporter("ExtendReports.html");
		er=new ExtentReports();
		er.attachReporter(esr);
	}
	@AfterSuite
	public void flush()
	{
		er.flush();
	}
	

}
