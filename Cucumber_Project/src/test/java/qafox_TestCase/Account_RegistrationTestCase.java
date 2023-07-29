package qafox_TestCase;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import qafox_pages.QAFOX_Common_Functions;
import qafox_pages.QAFOX_RegisterAccount_Page;

public class Account_RegistrationTestCase extends QAFOX_Common_Functions
{
	@Given("Url:{string}")
	public void url(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
		open_browser(string);
		String actual_url="https://tutorialsninja.com/demo/index.php?route=account/register";
		String expected_url=driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url,"Successfully Navigate to QAFOX Create Account page");	
	
	}

	@Then("QAFOX Account registration page should be displayed")
	public void qafox_account_registration_page_should_be_displayed() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("firstname {string}")
	public void firstname(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
		//check_navigate_QAFOXRegisterAccountPage();
		String actual_firstname="Duher";
		QAFOX_RegisterAccount_Page.click_firstname_inputbox();
		Assert.assertTrue(QAFOX_RegisterAccount_Page.firstname_inputbox().isDisplayed(),"Respected inputbox should not be Clicked ");
		QAFOX_RegisterAccount_Page.enter_firstname(string);
	    Assert.assertEquals(actual_firstname,QAFOX_RegisterAccount_Page.firstname_inputbox().getAttribute("value"),"Expected firstname should be entered successfully");
	    
	}

	@Then("Firstname entered successfully")
	public void firstname_entered_successfully() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("lastname {string}")
	public void lastname(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
		String actual_lastname="Quazi";
		QAFOX_RegisterAccount_Page.click_lastname_inputbox();
	    QAFOX_RegisterAccount_Page.enter_lastname(string);
	    Assert.assertEquals(actual_lastname, QAFOX_RegisterAccount_Page.lastname_inputbox().getAttribute("value"),"Expected lastname should not be entered ");
	    

	}

	@Then("Lastname entered successfully")
	public void lastname_entered_successfully() 
	{
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("Email {string}")
	public void email(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
		String actual_email="duher@gmail.com";
		QAFOX_RegisterAccount_Page.click_email_inputbox();
	    QAFOX_RegisterAccount_Page.enter_email(string);
	    Assert.assertEquals(actual_email, QAFOX_RegisterAccount_Page.email_inputbox().getAttribute("value"),"Expected lastname should not be entered successfully");
	    
	}

	@Then("Email entered successfully")
	public void email_entered_successfully() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("Telephon number {string}")
	public void telephon_number(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    String actual_phoneNo="9999999999";
	    QAFOX_RegisterAccount_Page.click_telephon_inputbox();
	    QAFOX_RegisterAccount_Page.enter_telephonNo(string);
	    Assert.assertEquals(actual_phoneNo, QAFOX_RegisterAccount_Page.telephon_inputbox().getAttribute("value"),"Expected phon number should not be entered ");
	
	}

	@Then("Telephon number entered successfully")
	public void telephon_number_entered_successfully() 
	{
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("Password {string}")
	public void password(String string)
	{
	    // Write code here that turns the phrase above into concrete actions
		  String actual_password="Duher123";
		  QAFOX_RegisterAccount_Page.click_password_inputbox();
		  QAFOX_RegisterAccount_Page.enter_password(string);
		  Assert.assertEquals(actual_password,QAFOX_RegisterAccount_Page.password_inputbox().getAttribute("value"),"Expected password should not be entered ");

	}

	@Then("Password entered successfully")
	public void password_entered_successfully() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("Confirm password {string}")
	public void confirm_password(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
		String actual_password="Duher123";
		QAFOX_RegisterAccount_Page.click_confirmPassword_inputbox();
	    QAFOX_RegisterAccount_Page.enter_confirmPassword(string);
	    Assert.assertEquals(actual_password,QAFOX_RegisterAccount_Page.confirmPassword_inputbox().getAttribute("value"),"Expected confirm password should not be entered");
	    
	}

	@Then("Confirm Password entered successfully")
	public void confirm_password_entered_successfully() 
	{
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("Click subscribe radio button no option")
	public void click_subscribe_radio_button_no_option()
	{
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertFalse(QAFOX_RegisterAccount_Page.subscribeoption_yes().isSelected(),"Yes Option is selected it is not expected");

	}

	@Then("Expected radio button should be checked")
	public void expected_radio_button_should_be_checked() 
	{
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("Click privacy policy checkbox")
	public void click_privacy_policy_checkbox() 
	{
	    // Write code here that turns the phrase above into concrete actions
		 QAFOX_RegisterAccount_Page.click_privacy_policy_checkbox();
		 Assert.assertTrue(QAFOX_RegisterAccount_Page.privacy_policy_checkbox().isSelected(), "Privacy checkbox is not clicked");
		
	}

	@Then("Privacy policy checkbox should be displayed Checked")
	public void privacy_policy_checkbox_should_be_displayed_checked() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("check lastname inputbox")
	public void check_lastname_inputbox() 
	{
		 String empty=QAFOX_RegisterAccount_Page.lastname_inputbox().getAttribute("value");
		 Assert.assertTrue(empty.isEmpty(),"Lastname inputbox should not be empty");
		    
	}

	@Then("Lastname inputbox should be displayed blank\\(empty)")
	public void lastname_inputbox_should_be_displayed_blank_empty() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Click Continue button")
	public void click_continue_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
		QAFOX_RegisterAccount_Page.click_continue_button();
	    Assert.assertTrue(QAFOX_RegisterAccount_Page.blankfield_errormsg().isDisplayed(),"Expected Error message should not be displayed");
		
	}

	@Then("Expected Error message should be displayed")
	public void expected_error_message_should_be_displayed() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
