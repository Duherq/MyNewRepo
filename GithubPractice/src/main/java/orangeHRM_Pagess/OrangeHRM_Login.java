package orangeHRM_Pagess;


import org.testng.Assert;

public class OrangeHRM_Login extends Driver 
{
	public static void main(String[] args) throws Exception
	{
		
	    OpenBrowser();
	    String actual_url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    String expected_url=driver.getCurrentUrl();
	    Assert.assertEquals(actual_url, expected_url,"Sorry your not navigate to OrangeHRM_Login page");
	    
		OrangeHRM_LoginPage.click_username();
		Assert.assertTrue(OrangeHRM_LoginPage.username().isSelected(),"Username inputbox is not clicked");
		
		String actual_username="Admin";
		OrangeHRM_LoginPage.enterusername("Admin");
		String expected_username=OrangeHRM_LoginPage.username().getAttribute("value");
		Assert.assertEquals(actual_username, expected_username,"Sorry Expected username is not match with actual username");
		
		OrangeHRM_LoginPage.click_password();
		Assert.assertTrue(OrangeHRM_LoginPage.password().isSelected(),"Username inputbox is not clicked");
		
		String actual_password="admin123";
		OrangeHRM_LoginPage.enterpassword("admin123");
		String expected_password=OrangeHRM_LoginPage.password().getAttribute("value");
		Assert.assertEquals(actual_password, expected_password,"Sorry Expected password is not match with actual username");
		
		Assert.assertTrue(OrangeHRM_LoginPage.login_btn().isDisplayed(),"Login button should not be displayed");
		OrangeHRM_LoginPage.click_login_btn();
		
		String actual_dashboardurl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(actual_dashboardurl,driver.getCurrentUrl() ,"Sory Something went wrong not login");
		
		
        
	}

}
