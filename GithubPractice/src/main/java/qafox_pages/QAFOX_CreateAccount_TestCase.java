package qafox_pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class QAFOX_CreateAccount_TestCase extends QAF_Common_Functions
{

	@BeforeMethod
	public void launch_browser() throws Exception
	{
		open_browser();
	}
	@AfterMethod
	public void close_browserr() throws Exception
	{
	    close_browser();	
	}
	@Test
	public void check_navigate_QAFOXCreateAccountPage() throws Exception
	{
		String actual_url="https://tutorialsninja.com/demo/index.php?route=account/register";
		String expected_url=driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url,"Successfully Navigate to QAFOX Create Account page");	
	}
	@Test
	public void check_createaccountwith_validCredentials() throws Exception
	{
		String actual_firstname="Duher";
		String actual_lastname="Quazi";
		String actual_email="duher123@gmail.com";
		String actual_phoneNo="9999999999";
		
		check_navigate_QAFOXCreateAccountPage();
		QAFOX_CreateAccount_Page.click_firstname_inputbox();
		Assert.assertTrue(QAFOX_CreateAccount_Page.firstname_inputbox().isDisplayed(),"Respected inputbox should not be Clicked successfully");
		QAFOX_CreateAccount_Page.enter_firstname("Duher");
		String expected_firstname=QAFOX_CreateAccount_Page.firstname_inputbox().getAttribute("value");
	    Assert.assertEquals(actual_firstname,expected_firstname,"Expected firstname should be entered successfully");
	    
	    QAFOX_CreateAccount_Page.click_lastname_inputbox();
	    Assert.assertTrue(QAFOX_CreateAccount_Page.lastname_inputbox().isDisplayed(),"Respected inputbox should not be clicked successfully");
	    QAFOX_CreateAccount_Page.enter_lastname("Quazi");
	    String expected_lastname=QAFOX_CreateAccount_Page.lastname_inputbox().getAttribute("value");
	    Assert.assertEquals(actual_lastname, expected_lastname,"Expected lastname should not be entered successfully");
	    
	    QAFOX_CreateAccount_Page.click_email_inputbox();
	    Assert.assertTrue(QAFOX_CreateAccount_Page.email_inputbox().isDisplayed(),"Respected inputbox should not be clicked successfully");
	    QAFOX_CreateAccount_Page.enter_email("duher123@gmail.com");
	    String expected_email=QAFOX_CreateAccount_Page.email_inputbox().getAttribute("value");
	    Assert.assertEquals(actual_email, expected_email,"Expected lastname should be entered successfully");
	    
	
	}


}
