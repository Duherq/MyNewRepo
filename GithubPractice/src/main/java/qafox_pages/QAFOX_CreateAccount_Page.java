package qafox_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QAFOX_CreateAccount_Page extends QAF_Common_Functions
{
	private static By firstname_xpath=By.xpath("//input[@name='firstname']");
	private static By lastname_xpath=By.xpath("//input[@name='lastname']");
	private static By email_xpath=By.xpath("//input[@name='email']");
	private static By telephon_inputbox_xpath=By.xpath("//input[@name='telephone']");
	private static By password_xpath=By.xpath("//input[@name='password']");
	private static By confirmpassword_xpath=By.xpath("//input[@name='confirm']");
	private static By privacy_policy_checkbox_xpath=By.xpath("//input[@name='agree']");
	private static By navbar_tabs_xpath=By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']//ul/li/a");
    private static By components_tab_xpath=By.xpath("//a[@class='dropdown-toggle' and text()='Components']");
	
	public static WebElement firstname_inputbox()
	{
		WebElement firstname=driver.findElement(firstname_xpath);
		return firstname;
	}
	public static void click_firstname_inputbox()
	{
		firstname_inputbox().click();
	}
	public static void enter_firstname(String fname)
	{
		firstname_inputbox().sendKeys(fname);
	}
	public static WebElement lastname_inputbox()
	{
		WebElement lastname=driver.findElement(lastname_xpath);
		return lastname;
	}
	public static void click_lastname_inputbox()
	{
		lastname_inputbox().click();
	}
	public static void enter_lastname(String lname)
	{
		lastname_inputbox().sendKeys(lname);
	}
	
	public static WebElement email_inputbox()
	{
		WebElement email=driver.findElement(email_xpath);
		return email;
	}
	public static void click_email_inputbox()
	{
		email_inputbox().click();
	}
	public static void enter_email(String email)
	{
		email_inputbox().sendKeys(email);
	}
	public static WebElement telephon_inputbox()
	{
	   WebElement telephon=driver.findElement(telephon_inputbox_xpath);
	   return telephon;
	}
	public static void click_telephon_inputbox()
	{
		telephon_inputbox().click();
	}
	public static void enter_telephonNo(String phon_No)
	{
		telephon_inputbox().sendKeys(phon_No);
	}
	public static WebElement password_inputbox()
	{
		WebElement password=driver.findElement(password_xpath);
		return password;
	}
	public static void click_password_inputbox()
	{
		password_inputbox().click();
	}
	public static void enter_password(String password)
	{
		firstname_inputbox().sendKeys(password);
	}
	public static WebElement confirmPassword_inputbox()
	{
		WebElement cpassword=driver.findElement(confirmpassword_xpath);
		return cpassword;
	}
	public static void click_confirmPassword_inputbox()
	{
		confirmPassword_inputbox().click();
	}
	public static void enter_confirmPassword(String password)
	{
		confirmPassword_inputbox().sendKeys(password);
	}
	public static WebElement privacy_policy_checkbox()
	{
		WebElement p_p_checkbox=driver.findElement(privacy_policy_checkbox_xpath);
		return p_p_checkbox;
	}
	public static void click_privacy_policy_checkbox()
	{
		privacy_policy_checkbox().click();
	}
	public static List<WebElement> navbar_tabs()
	{
		List<WebElement> tabs=driver.findElements(navbar_tabs_xpath);
		return tabs;
	}
	public static WebElement component_tab()
	{
		WebElement component=driver.findElement(components_tab_xpath);
		return component;
	}
	

}
