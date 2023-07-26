package qafox_pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QAFOX_Common_Functions
{
	 public static WebDriver driver;
		
		public static void open_browser(String url)
		{
			driver=new ChromeDriver();
			driver.get(url);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			driver.manage().window().maximize();
		}
		public static void click_navbar_tabs(String tab_name)
		{
			List<WebElement> tab=QAFOX_RegisterAccount_Page.navbar_tabs();
			
			for(WebElement i:tab)
			{
				String tabs=i.getText();
			      
				  if(tabs.equalsIgnoreCase(tab_name))
				  {
					  moveto(i);
				  }
				
			}
			
		}
		public static void close_browser()
		{
			driver.close();
		}
		public static void moveto(WebElement target)
		{
			Actions act=new Actions(driver);
			     act.click(target).perform();
			     target.click();
		}

}
