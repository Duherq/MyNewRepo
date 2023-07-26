package qafoxpages;

import com.microsoft.playwright.Locator;

public class QAF_RegisterAccount_Page extends QAFOX_BaseFunctionality
{
	
   private static String firstname_xpath="//input[@id='input-firstname' and @name='firstname']";
   private static String lastname_xpath="//input[@name='lastname']";
   private static String email_xpath="//input[@name='email']";
   private static String telephon_xpath="//input[@name='telephone']";
   private static String password_xpath="//input[@id='input-password' and @name='password']";
   private static String confirmpassword_xpath="//input[@name='confirm']";
   private static String privacy_policy_xpath="//input[@name='agree']";
 //  private static String navbar_tab_xpath="//div[@class='collapse navbar-collapse navbar-ex1-collapse']//ul/li/a";
   private static String subscriptionOption_xpath="//label[@class='radio-inline']//input[@name='newsletter' and @value='1']";
   private static String blank_mfield_errormsg_xpath="//div[text()='Last Name must be between 1 and 32 characters!']";
   private static String continue_button_xpath="//input[@class='btn btn-primary']";
   private static String privacy_error_msg_xpath="//div[text()='Warning: You must agree to the Privacy Policy!']";

   public static Locator firstname_inputbox()
   {
	   return page.locator(firstname_xpath);
   }
   public static void click_firstname_inputbox()
   {
	   firstname_inputbox().click();
   }
   public static void enter_firstname(String name)
   {
	   firstname_inputbox().type(name);
   }
   public static Locator lastname_inputbox()
	{
		return page.locator(lastname_xpath);
		
	}
	public static void click_lastname_inputbox()
	{
		lastname_inputbox().click();
	}
	public static void enter_lastname(String lname)
	{
		lastname_inputbox().type(lname);
	}
	
	public static Locator email_inputbox()
	{
		return page.locator(email_xpath);
	}
	public static void click_email_inputbox()
	{
		email_inputbox().click();
	}
	public static void enter_email(String email)
	{
		email_inputbox().type(email);
	}
	public static Locator telephon_inputbox()
	{
	  return page.locator(telephon_xpath);
	}
	public static void click_telephon_inputbox()
	{
		telephon_inputbox().click();
	}
	public static void enter_telephonNo(String phon_No)
	{
		telephon_inputbox().type(phon_No);
	}
	public static Locator password_inputbox()
	{
		return page.locator(password_xpath);
	}
	public static void click_password_inputbox()
	{
		password_inputbox().click();
	}
	public static void enter_password(String password)
	{
		password_inputbox().type(password);
	}
	public static Locator confirmPassword_inputbox()
	{
		return page.locator(confirmpassword_xpath);
	}
	public static void click_confirmPassword_inputbox()
	{
		confirmPassword_inputbox().click();
	}
	public static void enter_confirmPassword(String password)
	{
		confirmPassword_inputbox().type(password);
	}
	public static Locator privacy_policy_checkbox()
	{
		return page.locator(privacy_policy_xpath);
	}
	public static void click_privacy_policy_checkbox()
	{
		privacy_policy_checkbox().click();
	}
//	public static List<WebElement> navbar_tabs()
//	{
//		List<WebElement> tabs=driver.findElements(navbar_tabs_xpath);
//		return tabs;
//	}
	
//	public static Locator component_tab()
//	{
//		return page.locator("");
//	}
	public static Locator subscribeoption_yes()
	{
		return page.locator(subscriptionOption_xpath);
	}
	public static void click_yesoption()
	{
		subscribeoption_yes().click();
	}
	public static Locator blankfield_errormsg()
	{
		return page.locator(blank_mfield_errormsg_xpath);
	}
	public static Locator continue_button()
	{
		return page.locator(continue_button_xpath);
	}
	public static void click_continue_button()
	{
		continue_button().click();
	}
	public static Locator privacyPolicy_errormsg()
	{
		return page.locator(privacy_error_msg_xpath);
	}

}
