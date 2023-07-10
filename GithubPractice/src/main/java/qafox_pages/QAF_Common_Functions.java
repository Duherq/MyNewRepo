package qafox_pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QAF_Common_Functions
{
	 static WebDriver driver;
		
		public static void open_browser()
		{
			driver=new ChromeDriver();
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			driver.manage().window().maximize();
		}
		public static void click_navbar_tabs(String tab_name)
		{
			List<WebElement> tab=QAFOX_CreateAccount_Page.navbar_tabs();
			
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
