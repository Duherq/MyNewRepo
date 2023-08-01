package qafox_TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qafoxpages.QAFOX_BaseFunctionality;
import qafoxpages.QAF_RegisterAccount_Page;

public class QAFOX_RegisterAccount_TestCase extends QAFOX_BaseFunctionality
{
	@BeforeMethod
	public void launch_browser() throws Exception
	{
		open_Browser();
	}
	
	@AfterMethod
	public void Close_browser()
	{
		close_browser();
	}
	
	String actual_firstname;
	String actual_lastname;
	String actual_email;
	String actual_phoneNo;
	String actual_password;

	
	@Test(priority=1,description="Test Case:Validate Navigate to QAFOX Register Account page",groups="Register Account")
	public void check_navigate_QAFOXRegisterAccountPage() throws Exception
	{
		String actual_url="https://tutorialsninja.com/demo/index.php?route=account/register";
		String expected_url=page.url();
		Assert.assertEquals(actual_url, expected_url,"Successfully Navigate to QAFOX Create Account page");	
	}
	@Test(priority=2,description="Test Case:Validate Create Account with valid Credentials",groups="Register Account")
	public void check_registeraccountwith_validCredentials() throws Exception
	{
		 actual_firstname="Duher";
		 actual_lastname="Quazi";
		 actual_email="duher123@gmail.com";
		 actual_phoneNo="9999999999";
		 actual_password="Duher@123";

		
		check_navigate_QAFOXRegisterAccountPage();
		QAF_RegisterAccount_Page.click_firstname_inputbox();
		QAF_RegisterAccount_Page.enter_firstname("Duher");
	    Assert.assertEquals(actual_firstname,QAF_RegisterAccount_Page.firstname_inputbox().inputValue(),"Expected firstname should be entered successfully");
	    
	    
	    QAF_RegisterAccount_Page.click_lastname_inputbox();
	    QAF_RegisterAccount_Page.enter_lastname("Quazi");
	    Assert.assertEquals(actual_lastname, QAF_RegisterAccount_Page.lastname_inputbox().inputValue(),"Expected lastname should not be entered ");
	    
	    QAF_RegisterAccount_Page.click_email_inputbox();
	    QAF_RegisterAccount_Page.enter_email("duher123@gmail.com");
	    Assert.assertEquals(actual_email, QAF_RegisterAccount_Page.email_inputbox().inputValue(),"Expected lastname should not be entered successfully");
	    
	    QAF_RegisterAccount_Page.click_telephon_inputbox();
	    QAF_RegisterAccount_Page.enter_telephonNo("9999999999");
	    Assert.assertEquals(actual_phoneNo, QAF_RegisterAccount_Page.telephon_inputbox().inputValue(),"Expected phon number should not be entered ");
	
	    QAF_RegisterAccount_Page.click_password_inputbox();
	    QAF_RegisterAccount_Page.enter_password("Duher@123");
	    Assert.assertEquals(actual_password,QAF_RegisterAccount_Page.password_inputbox().inputValue(),"Expected password should not be entered ");

	    QAF_RegisterAccount_Page.click_confirmPassword_inputbox();
	    QAF_RegisterAccount_Page.enter_confirmPassword("Duher@123");
	    Assert.assertEquals(actual_password,QAF_RegisterAccount_Page.confirmPassword_inputbox().inputValue(),"Expected confirm password should not be entered");
	    
	    Assert.assertFalse(QAF_RegisterAccount_Page.subscribeoption_yes().isChecked(),"Yes Option is selected it is not expected");
	    
	    QAF_RegisterAccount_Page.click_privacy_policy_checkbox();
	    Assert.assertTrue(QAF_RegisterAccount_Page.privacy_policy_checkbox().isChecked(), "Privacy checkbox is not clicked");
	}
	
	@Test(priority=3,description="TestCase:Validate Register Account with blank one mandatory field",groups="Register Account")
	public void validate_registerAccount_blankOne_mandatoryField() throws Exception
	{
		 actual_firstname="Duher";
		 actual_email="duher123@gmail.com";
		 actual_phoneNo="9999999999";
		 actual_password="Duher@123";

		
		check_navigate_QAFOXRegisterAccountPage();
		QAF_RegisterAccount_Page.click_firstname_inputbox();
		QAF_RegisterAccount_Page.enter_firstname("Duher");
	    Assert.assertEquals(actual_firstname,QAF_RegisterAccount_Page.firstname_inputbox().inputValue(),"Expected firstname should be entered successfully");
	   
	    String empty=QAF_RegisterAccount_Page.lastname_inputbox().inputValue();
	    Assert.assertTrue(empty.isEmpty(), actual_password);
	    
	    QAF_RegisterAccount_Page.click_email_inputbox();
	    QAF_RegisterAccount_Page.enter_email("duher123@gmail.com");
	    Assert.assertEquals(actual_email, QAF_RegisterAccount_Page.email_inputbox().inputValue(),"Expected lastname should not be entered successfully");
	    
	    QAF_RegisterAccount_Page.click_telephon_inputbox();
	    QAF_RegisterAccount_Page.enter_telephonNo("9999999999");
	    Assert.assertEquals(actual_phoneNo, QAF_RegisterAccount_Page.telephon_inputbox().inputValue(),"Expected phon number should not be entered ");
	
	    QAF_RegisterAccount_Page.click_password_inputbox();
	    QAF_RegisterAccount_Page.enter_password("Duher@123");
	    Assert.assertEquals(actual_password,QAF_RegisterAccount_Page.password_inputbox().inputValue(),"Expected password should not be entered ");

	    QAF_RegisterAccount_Page.click_confirmPassword_inputbox();
	    QAF_RegisterAccount_Page.enter_confirmPassword("Duher@123");
	    Assert.assertEquals(actual_password,QAF_RegisterAccount_Page.confirmPassword_inputbox().inputValue(),"Expected confirm password should not be entered");
	    
	    Assert.assertFalse(QAF_RegisterAccount_Page.subscribeoption_yes().isChecked(),"Yes Option is selected it is not expected");
	    
	    QAF_RegisterAccount_Page.click_privacy_policy_checkbox();
	    Assert.assertTrue(QAF_RegisterAccount_Page.privacy_policy_checkbox().isChecked(), "Privacy checkbox is not clicked");
	    
	    QAF_RegisterAccount_Page.click_continue_button();
	    Assert.assertTrue(QAF_RegisterAccount_Page.blankfield_errormsg().isVisible(),"Expected Error message should not be displayed");
		
	}
   @Test(priority=4,description="Test Case:Validate Register Account with fill all fields without privacy policy",groups="Register Account")
   public void validate_RegisterAccount_WithoutPirvacyPolicy() throws Exception
   {
	    actual_firstname="Duher";
		actual_lastname="Quazi";
	    actual_email="duher123@gmail.com";
		actual_phoneNo="9999999999";
		actual_password="Duher@123";
		
		check_navigate_QAFOXRegisterAccountPage();
		
		QAF_RegisterAccount_Page.click_firstname_inputbox();
		QAF_RegisterAccount_Page.enter_firstname("Duher");
	    Assert.assertEquals(actual_firstname,QAF_RegisterAccount_Page.firstname_inputbox().inputValue(),"Expected firstname should be entered successfully");
	    
	    QAF_RegisterAccount_Page.click_lastname_inputbox();
	    QAF_RegisterAccount_Page.enter_lastname("Quazi");
	    Assert.assertEquals(actual_lastname, QAF_RegisterAccount_Page.lastname_inputbox().inputValue(),"Expected lastname should not be entered ");
	    
	    QAF_RegisterAccount_Page.click_email_inputbox();
	    QAF_RegisterAccount_Page.enter_email("duher123@gmail.com");
	    Assert.assertEquals(actual_email, QAF_RegisterAccount_Page.email_inputbox().inputValue(),"Expected lastname should not be entered successfully");
	    
	    QAF_RegisterAccount_Page.click_telephon_inputbox();
	    QAF_RegisterAccount_Page.enter_telephonNo("9999999999");
	    Assert.assertEquals(actual_phoneNo, QAF_RegisterAccount_Page.telephon_inputbox().inputValue(),"Expected phon number should not be entered ");
	
	    QAF_RegisterAccount_Page.click_password_inputbox();
	    QAF_RegisterAccount_Page.enter_password("Duher@123");
	    Assert.assertEquals(actual_password,QAF_RegisterAccount_Page.password_inputbox().inputValue(),"Expected password should not be entered ");

	    QAF_RegisterAccount_Page.click_confirmPassword_inputbox();
	    QAF_RegisterAccount_Page.enter_confirmPassword("Duher@123");
	    Assert.assertEquals(actual_password,QAF_RegisterAccount_Page.confirmPassword_inputbox().inputValue(),"Expected confirm password should not be entered");
	    
	    
	    Assert.assertFalse(QAF_RegisterAccount_Page.subscribeoption_yes().isChecked(),"Yes Option is selected it is not expected");
	   
	    QAF_RegisterAccount_Page.click_continue_button();
	   Assert.assertTrue(QAF_RegisterAccount_Page.privacyPolicy_errormsg().isVisible(), "Expected Error Message Should not be displayed");
		
   }

}
