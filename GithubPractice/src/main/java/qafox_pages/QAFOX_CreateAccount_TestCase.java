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
	@Test(priority=1)
	public void check_navigate_QAFOXCreateAccountPage() throws Exception
	{
		String actual_url="https://tutorialsninja.com/demo/index.php?route=account/register";
		String expected_url=driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url,"Successfully Navigate to QAFOX Create Account page");	
	}
	@Test(priority=2)
	public void check_createaccountwith_validCredentials() throws Exception
	{
		String actual_firstname="Duher";
		String actual_lastname="Quazi";
		String actual_email="duher123@gmail.com";
		String actual_phoneNo="9999999999";
		String actual_password="Duher@123";

		
		check_navigate_QAFOXCreateAccountPage();
		QAFOX_CreateAccount_Page.click_firstname_inputbox();
		Assert.assertTrue(QAFOX_CreateAccount_Page.firstname_inputbox().isDisplayed(),"Respected inputbox should not be Clicked ");
		QAFOX_CreateAccount_Page.enter_firstname("Duher");
	    Assert.assertEquals(actual_firstname,QAFOX_CreateAccount_Page.firstname_inputbox().getAttribute("value"),"Expected firstname should be entered successfully");
	    
	    QAFOX_CreateAccount_Page.click_lastname_inputbox();
	    Assert.assertTrue(QAFOX_CreateAccount_Page.lastname_inputbox().isDisplayed(),"Respected inputbox should not be clicked ");
	    QAFOX_CreateAccount_Page.enter_lastname("Quazi");
	    Assert.assertEquals(actual_lastname, QAFOX_CreateAccount_Page.lastname_inputbox().getAttribute("value"),"Expected lastname should not be entered ");
	    
	    QAFOX_CreateAccount_Page.click_email_inputbox();
	    Assert.assertTrue(QAFOX_CreateAccount_Page.email_inputbox().isDisplayed(),"Respected inputbox should not be clicked ");
	    QAFOX_CreateAccount_Page.enter_email("duher123@gmail.com");
	    Assert.assertEquals(actual_email, QAFOX_CreateAccount_Page.email_inputbox().getAttribute("value"),"Expected lastname should not be entered successfully");
	    
	    QAFOX_CreateAccount_Page.click_telephon_inputbox();
	    Assert.assertTrue(QAFOX_CreateAccount_Page.telephon_inputbox().isDisplayed(),"Respected inputbox should not be clicked");
	    QAFOX_CreateAccount_Page.enter_telephonNo("9999999999");
	    Assert.assertEquals(actual_phoneNo, QAFOX_CreateAccount_Page.telephon_inputbox().getAttribute("value"),"Expected phon number should not be entered ");
	
	    QAFOX_CreateAccount_Page.click_password_inputbox();
	    Assert.assertTrue(QAFOX_CreateAccount_Page.password_inputbox().isDisplayed(),"Respected inputbox should not be clicked");
	    QAFOX_CreateAccount_Page.enter_password("Duher@123");
	    System.out.println(QAFOX_CreateAccount_Page.password_inputbox().getDomAttribute("value"));
	    Assert.assertEquals(actual_password,QAFOX_CreateAccount_Page.password_inputbox().getAttribute("value"),"Expected password should not be entered ");

	    QAFOX_CreateAccount_Page.click_confirmPassword_inputbox();
	    Assert.assertTrue(QAFOX_CreateAccount_Page.confirmPassword_inputbox().isDisplayed(),"Respected inputbox should not be clicked");
	    QAFOX_CreateAccount_Page.enter_confirmPassword("Duher@123");
	    Assert.assertEquals(actual_password,QAFOX_CreateAccount_Page.confirmPassword_inputbox().getAttribute("value"),"Expected confirm password should not be entered");
	    
	    Assert.assertFalse(QAFOX_CreateAccount_Page.subscribeoption_yes().isSelected(),"Yes Option is selected it is not expected");
	    
	    QAFOX_CreateAccount_Page.click_privacy_policy_checkbox();
	    Assert.assertTrue(QAFOX_CreateAccount_Page.privacy_policy_checkbox().isSelected(), "Privacy checkbox is not clicked");
	}


}
