package qafoxpages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class QAFOX_BaseFunctionality 
{
	public static Page page;
	private ExtentSparkReporter esr;
	public static ExtentReports er;
	public static ExtentTest et;
	public static ExtentTest tr;
	
	public static void open_Browser() throws Exception
	{
		Playwright pw=Playwright.create();
		Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page=browser.newPage();
		
		page.navigate("https://tutorialsninja.com/demo/index.php?route=account/register");
		
	}
	public static void close_browser()
	{
		page.close();
	}
	@BeforeSuite
	public void bs()
	{
		esr=new ExtentSparkReporter("QAFOX_TestCase_Report.html");
		er=new ExtentReports();
		er.attachReporter(esr);
		
	}
	@AfterSuite
	public void as()
	{
		er.flush();
	}
	public static void qafox_login(String email,String password)
	{
		
	}
	public static void select_myaccountdropdown_option(String option)
	{
		
	}

}
