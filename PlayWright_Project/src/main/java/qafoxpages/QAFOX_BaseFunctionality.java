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
		page.wait(5000);
	}
	public static void close_browser()
	{
		page.close();
	}

}
