package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionDemo_Driver 
{
	public static WebDriver driver;
	
	public static void open_browser(String url)
	{
		WebDriver driver = new ChromeDriver(); 
	  	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	  	  driver.manage().window().maximize();
	  	  driver.get(url);
	}
	public static void close_browser()
	{
		driver.close();
	}

}
