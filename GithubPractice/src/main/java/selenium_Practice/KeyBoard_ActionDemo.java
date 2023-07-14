package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class KeyBoard_ActionDemo extends ActionDemo_Driver 
{
	public static void keyboardAction_demo() 
	{
		open_browser("https://demoqa.com/text-box");
		
		By fullName_inputbox_xpath=By.xpath("//input[@id='userName' and @class=' mr-sm-2 form-control']");
		WebElement fullName_inputbox=driver.findElement(fullName_inputbox_xpath);
		
		fullName_inputbox.click();
		fullName_inputbox.sendKeys("Duher Quazi");
		
		By current_address_xpath=By.xpath("//div[@class='col-md-9 col-sm-12']//textarea[@class='form-control' and @id='currentAddress']");
		WebElement current_address=driver.findElement(current_address_xpath);
		
		current_address.click();
		current_address.sendKeys("MasbTank Ac Guard");
		
		current_address.sendKeys(Keys.CONTROL+"A");
		current_address.sendKeys(Keys.CONTROL+"C");
		
		By permanent_address_xpath=By.xpath("//div[@class='col-md-9 col-sm-12']//textarea[@id='permanentAddress' and @class='form-control']");
	    WebElement permanent_address=driver.findElement(permanent_address_xpath);
	    
	    
	    permanent_address.sendKeys(Keys.CONTROL+"V");
	    
	    close_browser();
	}

}
