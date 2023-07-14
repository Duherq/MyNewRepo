package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actions_Demo
{
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver(); 
	  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	  	  driver.manage().window().maximize();
	  	  driver.get("https://mousetester.com/");
  	  
  	  Actions act= new Actions(driver);
  	  
  	  By click_button_xpath=By.xpath("//div[@id='clickMe']");
  	  WebElement click_button=driver.findElement(click_button_xpath);
  	  
  	         act.contextClick(click_button).perform();//Right click
  	         act.doubleClick(click_button).perform();//Double click
  	         
  	         driver.close();
		         	
	}

}
