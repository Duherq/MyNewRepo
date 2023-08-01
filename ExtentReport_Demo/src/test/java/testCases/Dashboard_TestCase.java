package testCases;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.DashBoard_page;

public class Dashboard_TestCase extends BasePage
{
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
	public void tab1()
	{
		ts.info("Check Tab 1");
        DashBoard_page.check_tab();
		System.out.println("Tab 1 is present");
	}
	@Test
	public void tab2()
	{
		ts.info("Check Tab 2");
		System.out.println("Tab 2 is present");
	}
	@Test
	public void tab3()
	{
		ts.info("Check Tab 3");
		System.out.println("Tab 3 is present");
	}

}
