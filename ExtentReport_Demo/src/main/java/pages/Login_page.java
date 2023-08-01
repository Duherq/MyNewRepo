package pages;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Login_page extends BasePage
{
//	private static ExtentTest test;
//	private static ExtentTest ts;
	@BeforeClass
	
//    @Test
//    public void enterusername()
//    {
//    
//    	ts.info("Username Entered");
//    	System.out.println("Enter Successfully");
//    }
//    @Test
//    public void enter_password()
//    {
//    	ts.info("Entered password");
//    	System.out.println("Enter successfully");
//    }
    public static void click_loginbutton()
    {
    	ts.info("Login Button Clicked");
    }
    public static void click_password()
    {
    	ts.info("Password inputbox clicked successfully");
    }

}
