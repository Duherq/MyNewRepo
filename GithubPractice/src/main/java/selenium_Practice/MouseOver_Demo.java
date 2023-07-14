package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_Demo extends ActionDemo_Driver
{
	public static void mouseover_demo()
	{
		open_browser("https://www.orangehrm.com/");
		
		By company_link_xpath=By.xpath("//a[text()='Company']");
		WebElement company_link=driver.findElement(company_link_xpath);
		
		By pressReleases_link_xpath=By.xpath("//li[@class='sub-menu-title menu-title-row pt-2 pb-2']//a[text()='Press Releases']");
     	WebElement pressReleases_link=driver.findElement(pressReleases_link_xpath);
		
	           Actions act=new Actions(driver);
	           
     act.moveToElement(company_link).moveToElement(pressReleases_link).perform();
            pressReleases_link.click(); 
            
          close_browser();
		
	}

}
