package qafox_TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qafoxpages.QAFOX_BaseFunctionality;
import qafoxpages.QAF_RegisterAccount_Page;

public class QAFOX_Login_TestCase extends QAFOX_BaseFunctionality
{
	@BeforeMethod
	public void Open_Browser() throws Exception
	{
		open_Browser();
	}
//	@AfterMethod
//	public void Close_Browser()
//	{
//		close_browser();
//	}
	@Test(priority=1,description="Test Case:Validate Navigate to QAFOX Register Account page",groups="Register Account")
	public void check_navigate_QAFOXRegisterAccountPage() throws Exception
	{
		String actual_url="https://tutorialsninja.com/demo/index.php?route=account/register";
		String expected_url=page.url();
		Assert.assertEquals(actual_url, expected_url,"Successfully Navigate to QAFOX Create Account page");	
	}
	
	@Test(priority=2,description="Test Case: Validate QAFOX Login with valid credentials",groups="Login")
	public static void validate_login_with_validCredentials()
	{
	
	}

}
