package playwrite_Demo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class OpenBrowser 
{
	public static void main(String[] args) 
	{
		Playwright pw=Playwright.create();
		Browser b=pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=b.newPage();
		
		page.navigate("https://www.facebook.com");
		page.close();
	}

}
