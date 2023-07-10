package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_Demo 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
//		By platform_link_xpath=By.xpath("//a[text()='Platform']");
//		WebElement platform_link=driver.findElement(platform_link_xpath);
		
		By company_link_xpath=By.xpath("//a[text()='Company']");
		WebElement company_link=driver.findElement(company_link_xpath);
		
		By pressReleases_link_xpath=By.xpath("//li[@class='sub-menu-title menu-title-row pt-2 pb-2']//a[text()='Press Releases']");
     	WebElement pressReleases_link=driver.findElement(pressReleases_link_xpath);
		
	           Actions act=new Actions(driver);
	           
     act.moveToElement(company_link).moveToElement(pressReleases_link).perform();
            pressReleases_link.click(); 
		
	}

}
