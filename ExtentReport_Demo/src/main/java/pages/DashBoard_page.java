package pages;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;


public class DashBoard_page extends BasePage
{
//	private ExtentTest test;
//	private ExtentTest ts;
	
	@BeforeClass
	public void bc()
	{
		BasePage.et=BasePage.er.createTest("Dashboard_Page");
	}
	@BeforeMethod
	public void bm(Method m)
	{
		BasePage.ts=BasePage.et.createNode(m.getName());
		
	}
	
	public static void check_tab()
	{
		ts.info("Tab 1 is present");
	}
	
//	@Test
//	public void tab1()
//	{
//		ts.info("Check Tab 1");
//		System.out.println("Tab 1 is present");
//	}
//	@Test
//	public void tab2()
//	{
//		ts.info("Check Tab 2");
//		System.out.println("Tab 2 is present");
//	}
//	@Test
//	public void tab3()
//	{
//		ts.info("Check Tab 3");
//		System.out.println("Tab 3 is present");
//	}
//
}
