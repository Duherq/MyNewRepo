package qafox_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Login 
{
	public static void main(String[] args)
	{
	    WebDriver driver=new ChromeDriver();
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.manage().window().maximize();
	    
		By username_xpath=By.xpath("//input[@name='username']");
		WebElement username_inputbox=driver.findElement(username_xpath);
		
		username_inputbox.click();
		username_inputbox.sendKeys("Admin");
		
		By password_xpath=By.xpath("//input[@name='password']");
		WebElement password_inputbox=driver.findElement(password_xpath);
		
		password_inputbox.click();
		password_inputbox.sendKeys("admin123");

	}

}
