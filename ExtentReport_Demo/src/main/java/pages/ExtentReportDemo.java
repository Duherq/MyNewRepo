package pages;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo
{
	
	ExtentSparkReporter esr=new ExtentSparkReporter("Report.html");
	ExtentReports er=new ExtentReports();
	ExtentTest et;
	
	@BeforeClass
	public void bc()
	{
		er.attachReporter(esr);
	}
	
	@BeforeMethod
	public void bm(Method m)
	{
		
		et=er.createTest(m.getName());
	}
	@AfterClass
	public void ac()
	{
		er.flush();
	}
	
	
	@Test
	public void TestCase()
	{
		 et.info("Test1");
		 System.out.println("TC_1");
	
	}
	@Test
	public void TestCase2()
	{
		et.info("Test2");
		System.out.println("TC_2");
	}
	
	

}
