package testCases;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pages.BasePage;
import pages.Login_page;

public class Login_TestCases extends BasePage
{
//	private ExtentTest test;
//	private ExtentTest ts;
	
	@BeforeClass
	public void bc()
	{
		BasePage.et=BasePage.er.createTest("Login_TestCase");
	}
	@BeforeMethod
	public void bm(Method m)
	{
		BasePage.ts=BasePage.et.createNode(m.getName());
	}
	@Test
    public void valid_credentials()
    {
        
    	Login_page.click_loginbutton();
    	System.out.println("Pass Test1");
    	ts.info("pass");
    }
    @Test
    public void invalid_credentials()
    {
    	Login_page.click_password();
    	System.out.println("Pass Test2");
    	ts.info("pass");
    }

}
