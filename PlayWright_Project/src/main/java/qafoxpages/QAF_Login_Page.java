package qafoxpages;

import com.microsoft.playwright.Locator;

public class QAF_Login_Page extends QAFOX_BaseFunctionality
{
	private static String email_inputbox_xpath="//input[@id='input-email' and @name='email']";
	private static String password_inputbox_xpath="//input[@id='input-password' and @name='password']";
    private static String login_button_xpath="//input[@class='btn btn-primary']";
	private static String forgot_pass_link_xpath="//div[@class='form-group']//a[text()='Forgotten Password']";
    
	public static Locator emails_inputbox()
	{
		return page.locator(email_inputbox_xpath);
	}
	public static void click_email_inputbox()
	{
		emails_inputbox().click();
	}
	public static void enter_email(String email)
	{
		emails_inputbox().type(email);
	}
	public static Locator password_inputbox()
	{
		return page.locator(password_inputbox_xpath);
	}
	public static void click_password_inputbox()
	{
		password_inputbox().click();
	}
	public static void enter_password(String pass)
	{
		password_inputbox().type(pass);
	}
	public static Locator login_button()
	{
		return page.locator(login_button_xpath);
	}
	public static void click_login_button()
	{
		login_button().click();
	}
	public static Locator forgot_pass_link()
	{
		return page.locator(forgot_pass_link_xpath);
	}
	public static void click_forgot_pass()
	{
		forgot_pass_link().click();
	}
}
