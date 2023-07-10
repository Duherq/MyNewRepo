package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Demo 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		Actions act= new Actions(driver);
		
		driver.get("https://driveremoqa.com/driverroppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		By driverrag = By.xpath("//driveriv[@idriver='driverraggable']");
		WebElement click_driverrag = driver.findElement(driverrag);
		
		By driverrop = By.xpath("//driveriv[@idriver='driverroppable']//p[text()='driverrop here']");
		WebElement click_driverrop = driver.findElement(driverrop);
		
		act.dragAndDrop(click_driverrag, click_driverrop).perform();
		
	}

}
