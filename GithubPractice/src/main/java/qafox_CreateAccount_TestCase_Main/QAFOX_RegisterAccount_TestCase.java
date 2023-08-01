package qafox_CreateAccount_TestCase_Main;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qafox_pages.QAFOX_RegisterAccount_Page;
import qafox_pages.QAF_Common_Functions;

public class QAFOX_RegisterAccount_TestCase extends QAF_Common_Functions
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
	@Test(priority=1,description="Test Case:Validate Navigate to QAFOX Register Account page")
	public void check_navigate_QAFOXRegisterAccountPage() throws Exception
	{
		String actual_url="https://tutorialsninja.com/demo/index.php?route=account/register";
		String expected_url=driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url,"Successfully Navigate to QAFOX Create Account page");	
	}
	
	@Test(priority=2,description="Test Case:Validate Create Account with valid Credentials",groups="Register Account")
	public void check_registeraccountwith_validCredentials() throws Exception
	{
		String actual_firstname="Duher";
		String actual_lastname="Quazi";
		String actual_email="duher123@gmail.com";
		String actual_phoneNo="9999999999";
		String actual_password="Duher@123";

		
		check_navigate_QAFOXRegisterAccountPage();
		QAFOX_RegisterAccount_Page.click_firstname_inputbox();
		QAFOX_RegisterAccount_Page.enter_firstname("Duher");
	    Assert.assertEquals(actual_firstname,QAFOX_RegisterAccount_Page.firstname_inputbox().getAttribute("value"),"Expected firstname should be entered successfully");
	    
	    QAFOX_RegisterAccount_Page.click_lastname_inputbox();
	    QAFOX_RegisterAccount_Page.enter_lastname("Quazi");
	    Assert.assertEquals(actual_lastname, QAFOX_RegisterAccount_Page.lastname_inputbox().getAttribute("value"),"Expected lastname should not be entered ");
	    
	    QAFOX_RegisterAccount_Page.click_email_inputbox();
	    QAFOX_RegisterAccount_Page.enter_email("duher123@gmail.com");
	    Assert.assertEquals(actual_email, QAFOX_RegisterAccount_Page.email_inputbox().getAttribute("value"),"Expected lastname should not be entered successfully");
	    
	    QAFOX_RegisterAccount_Page.click_telephon_inputbox();
	    QAFOX_RegisterAccount_Page.enter_telephonNo("9999999999");
	    Assert.assertEquals(actual_phoneNo, QAFOX_RegisterAccount_Page.telephon_inputbox().getAttribute("value"),"Expected phon number should not be entered ");
	
	    QAFOX_RegisterAccount_Page.click_password_inputbox();
	    QAFOX_RegisterAccount_Page.enter_password("Duher@123");
	    Assert.assertEquals(actual_password,QAFOX_RegisterAccount_Page.password_inputbox().getAttribute("value"),"Expected password should not be entered ");

	    QAFOX_RegisterAccount_Page.click_confirmPassword_inputbox();
	    QAFOX_RegisterAccount_Page.enter_confirmPassword("Duher@123");
	    Assert.assertEquals(actual_password,QAFOX_RegisterAccount_Page.confirmPassword_inputbox().getAttribute("value"),"Expected confirm password should not be entered");
	    
	    Assert.assertFalse(QAFOX_RegisterAccount_Page.subscribeoption_yes().isSelected(),"Yes Option is selected it is not expected");
	    
	    QAFOX_RegisterAccount_Page.click_privacy_policy_checkbox();
	    Assert.assertTrue(QAFOX_RegisterAccount_Page.privacy_policy_checkbox().isSelected(), "Privacy checkbox is not clicked");
	}
	
	@Test(priority=3,description="TestCase:Validate Register Account with blank one mandatory field",groups="Register account")
	public void validate_registerAccount_blankOne_mandatoryField() throws Exception
	{
		String actual_firstname="Duher";
		String actual_email="duher123@gmail.com";
		String actual_phoneNo="9999999999";
		String actual_password="Duher@123";

		
		check_navigate_QAFOXRegisterAccountPage();
		QAFOX_RegisterAccount_Page.click_firstname_inputbox();
		QAFOX_RegisterAccount_Page.enter_firstname("Duher");
	    Assert.assertEquals(actual_firstname,QAFOX_RegisterAccount_Page.firstname_inputbox().getAttribute("value"),"Expected firstname should be entered successfully");
	 
	    String empty=QAFOX_RegisterAccount_Page.lastname_inputbox().getAttribute("value");
	    Assert.assertTrue(empty.isEmpty(), actual_password);
	    
	    QAFOX_RegisterAccount_Page.click_email_inputbox();
	    QAFOX_RegisterAccount_Page.enter_email("duher123@gmail.com");
	    Assert.assertEquals(actual_email, QAFOX_RegisterAccount_Page.email_inputbox().getAttribute("value"),"Expected lastname should not be entered successfully");
	    
	    QAFOX_RegisterAccount_Page.click_telephon_inputbox();
	    QAFOX_RegisterAccount_Page.enter_telephonNo("9999999999");
	    Assert.assertEquals(actual_phoneNo, QAFOX_RegisterAccount_Page.telephon_inputbox().getAttribute("value"),"Expected phon number should not be entered ");
	
	    QAFOX_RegisterAccount_Page.click_password_inputbox();
	    QAFOX_RegisterAccount_Page.enter_password("Duher@123");
	    Assert.assertEquals(actual_password,QAFOX_RegisterAccount_Page.password_inputbox().getAttribute("value"),"Expected password should not be entered ");

	    QAFOX_RegisterAccount_Page.click_confirmPassword_inputbox();
	    QAFOX_RegisterAccount_Page.enter_confirmPassword("Duher@123");
	    Assert.assertEquals(actual_password,QAFOX_RegisterAccount_Page.confirmPassword_inputbox().getAttribute("value"),"Expected confirm password should not be entered");
	    
	    Assert.assertFalse(QAFOX_RegisterAccount_Page.subscribeoption_yes().isSelected(),"Yes Option is selected it is not expected");
	    
	    QAFOX_RegisterAccount_Page.click_privacy_policy_checkbox();
	    Assert.assertTrue(QAFOX_RegisterAccount_Page.privacy_policy_checkbox().isSelected(), "Privacy checkbox is not clicked");
	    
	    QAFOX_RegisterAccount_Page.click_continue_button();
	    Assert.assertTrue(QAFOX_RegisterAccount_Page.blankfield_errormsg().isDisplayed(),"Expected Error message should not be displayed");
		
	}
	
	@Test(priority=4,description="Test Case:Validate Register Account with fill all fields without privacy policy",groups="Register Account")
	public void validate_RegisterAccount_withoutPrivacyPolicy() throws Exception
	{
		String actual_firstname="Duher";
		String actual_lastname="Quazi";
		String actual_email="duher123@gmail.com";
		String actual_phoneNo="9999999999";
		String actual_password="Duher@123";

		
		check_navigate_QAFOXRegisterAccountPage();
		QAFOX_RegisterAccount_Page.click_firstname_inputbox();
		QAFOX_RegisterAccount_Page.enter_firstname("Duher");
	    Assert.assertEquals(actual_firstname,QAFOX_RegisterAccount_Page.firstname_inputbox().getAttribute("value"),"Expected firstname should be entered successfully");
	    
	    QAFOX_RegisterAccount_Page.click_lastname_inputbox();
	    QAFOX_RegisterAccount_Page.enter_lastname("Quazi");
	    Assert.assertEquals(actual_lastname, QAFOX_RegisterAccount_Page.lastname_inputbox().getAttribute("value"),"Expected lastname should not be entered ");
	    
	    QAFOX_RegisterAccount_Page.click_email_inputbox();
	    QAFOX_RegisterAccount_Page.enter_email("duher123@gmail.com");
	    Assert.assertEquals(actual_email, QAFOX_RegisterAccount_Page.email_inputbox().getAttribute("value"),"Expected lastname should not be entered successfully");
	    
	    QAFOX_RegisterAccount_Page.click_telephon_inputbox();
	    QAFOX_RegisterAccount_Page.enter_telephonNo("9999999999");
	    Assert.assertEquals(actual_phoneNo, QAFOX_RegisterAccount_Page.telephon_inputbox().getAttribute("value"),"Expected phon number should not be entered ");
	
	    QAFOX_RegisterAccount_Page.click_password_inputbox();
	    QAFOX_RegisterAccount_Page.enter_password("Duher@123");
	    Assert.assertEquals(actual_password,QAFOX_RegisterAccount_Page.password_inputbox().getAttribute("value"),"Expected password should not be entered ");

	    QAFOX_RegisterAccount_Page.click_confirmPassword_inputbox();
	    QAFOX_RegisterAccount_Page.enter_confirmPassword("Duher@123");
	    Assert.assertEquals(actual_password,QAFOX_RegisterAccount_Page.confirmPassword_inputbox().getAttribute("value"),"Expected confirm password should not be entered");
	    
	    
	    Assert.assertFalse(QAFOX_RegisterAccount_Page.subscribeoption_yes().isSelected(),"Yes Option is selected it is not expected");
	   
	    Assert.assertFalse(QAFOX_RegisterAccount_Page.privacy_policy_checkbox().isSelected(), "Privacy Checkbox is Checked");
	    
	   QAFOX_RegisterAccount_Page.click_continue_button();
	   Assert.assertTrue(QAFOX_RegisterAccount_Page.privacyPolicy_errormsg().isDisplayed(), "Expected Error Message Should not be displayed");
		
	}


}
