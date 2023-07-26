package qafoxpages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Driver 
{
	public static Page page;
	public static void open_Browser()
	{
		Playwright pw=Playwright.create();
		Browser browser=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		page=browser.newPage();
	}

}
