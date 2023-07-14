package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Actions_Demo extends ActionDemo_Driver
{
	
	public static void action_demo()
	{
		open_browser("https://mousetester.com/");
  	  
  	  Actions act= new Actions(driver);
  	  
  	  By click_button_xpath=By.xpath("//div[@id='clickMe']");
  	  WebElement click_button=driver.findElement(click_button_xpath);
  	  
  	         act.contextClick(click_button).perform();//Right click
  	         act.doubleClick(click_button).perform();//Double click
  	         
  	         driver.close();
		         	
	}

}
