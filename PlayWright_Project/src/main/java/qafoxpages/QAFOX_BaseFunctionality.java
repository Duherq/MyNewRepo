package qafoxpages;

import org.testng.Assert;
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
		String actual_email="ztoh@gmail.com";
		String actual_pass="ztoh_india";
		
		String actual_url="https://tutorialsninja.com/demo/index.php?route=account/register";
		QAF_RegisterAccount_Page.click_login_button();
		Assert.assertEquals( actual_url ,page.url() , "Not Navigate to QAFOX Login page");
		
		QAF_Login_Page.click_email_inputbox();
		QAF_Login_Page.enter_email(email);
		Assert.assertEquals(actual_email,QAF_Login_Page.emails_inputbox().inputValue(),"Entered Email is Not match with actual_email");
	    
		QAF_Login_Page.click_password_inputbox();
		QAF_Login_Page.enter_password(password);
		Assert.assertEquals(actual_pass,QAF_Login_Page.password_inputbox().inputValue(),"Entered Password is not match with actual password");
	    
		Assert.assertTrue(QAF_Login_Page.login_button().isVisible(),"Login Button is not Displayed");
		QAF_Login_Page.click_login_button();
		
	}
	
}
