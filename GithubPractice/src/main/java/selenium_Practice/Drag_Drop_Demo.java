package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Demo extends ActionDemo_Driver
{
	public static void dragDrop_demo() 
	{
		open_browser("https://driveremoqa.com/driverroppable/");
		
		Actions act= new Actions(driver);
			
		By driverrag = By.xpath("//driveriv[@idriver='driverraggable']");
		WebElement click_driverrag = driver.findElement(driverrag);
		
		By driverrop = By.xpath("//driveriv[@idriver='driverroppable']//p[text()='driverrop here']");
		WebElement click_driverrop = driver.findElement(driverrop);
		
		act.dragAndDrop(click_driverrag, click_driverrop).perform();
		
		close_browser();
	}

}
