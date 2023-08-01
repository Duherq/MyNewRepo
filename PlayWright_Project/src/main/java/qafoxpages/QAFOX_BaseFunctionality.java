package qafoxpages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class QAFOX_BaseFunctionality 
{
	public static Page page;
	
	public static void open_Browser() throws Exception
	{
		Playwright pw=Playwright.create();
		Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page=browser.newPage();
		
		page.navigate("https://tutorialsninja.com/demo/index.php?route=account/register");
		
	}
	public static void close_browser()
	{
		page.close();
	}
	public static void qafox_login(String email,String password)
	{
		
	}
	public static void select_myaccountdropdown_option(String option)
	{
		
	}

}
