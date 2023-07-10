package orangeHRM_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrangeHRM_LoginPage 
{
	private static By username_xpath=By.xpath("//input[@name='username']");
	private static By password_xpath=By.xpath("//input[@name='password']");
	private static By login_xpath=By.xpath("//button[normalize-space(text()='Login')]");
	private static By forget_passlink_xpath=By.xpath("//div[normalize-space(text()='Forgot your password?') and @class='orangehrm-login-forgot']");
	private static By orangeHRM_logo_xpath=By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1683010990518']");
	private static By dashboard_logo_xpath=By.xpath("//div[@class='oxd-brand-banner']//img[@src='/web/images/orangehrm-logo.png?v=1683010990518']");
	private static By invalid_msg_xpath=By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
	private static By required_msg_xpath=By.xpath("//span[text()='Required']");
	
	
	public static WebElement username()
	{
		WebElement username=Driver.driver.findElement(username_xpath);
	        return username;	
		 
	}
	public static void click_username()
	{
		username().click();
	}
	public static void enterusername(String user_input)
	{
		 
		 username().sendKeys(user_input);
	}
	public static WebElement password()
	{
		WebElement password=Driver.driver.findElement(password_xpath);
		   return password;    
		
	}
	public static void click_password()
	{
		password().click();
	}
	public static void enterpassword(String user_input)
	{
		
		password().sendKeys(user_input);
	}
	public static WebElement login_btn()
	{
		WebElement login_button=Driver.driver.findElement(login_xpath);
		  return login_button;
	}
	public static void click_login_btn()
	{
		login_btn().click();
	}
	public static WebElement forget_password()
	{
		WebElement forget_link=Driver.driver.findElement(forget_passlink_xpath);
		return forget_link;
	}
	public static void click_forget_Password_link()
	{
		forget_password().click();
		 
	}
	public static WebElement orangeHRM_logo()
	{
		WebElement orangeHRM_logo=Driver.driver.findElement(orangeHRM_logo_xpath);
		return orangeHRM_logo;
	}
	public static WebElement dashboard_logo()
	{
		WebElement logo=Driver.driver.findElement(dashboard_logo_xpath);
		return logo;
	}
	public static WebElement invalid_msg()
	{
		WebElement invalid_msg=Driver.driver.findElement(invalid_msg_xpath);
		return invalid_msg;
	}
	public static WebElement required_msg()
	{
		WebElement msg=Driver.driver.findElement(required_msg_xpath);
		return msg;
	}
	 

}
