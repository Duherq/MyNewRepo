package orangeHRM_Pagess;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Driver 
{
	public static WebDriver driver;
	
	 public static void OpenBrowser() throws Exception
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
	
	}
	 public static void CloseBrowser()
	 {
		 driver.close();
	 }


}
