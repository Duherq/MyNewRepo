package selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecute_Demo 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	
		By search_inputbox_xpath= By.xpath("//input[@id='twotabsearchtextbox']");		
		WebElement search_inputbox= driver.findElement(search_inputbox_xpath);		
		search_inputbox.sendKeys("Casual men shoes",Keys.ENTER);		
		
//		By ser = By.xpath("//input[@id='nav-search-submit-button']");
//		WebElement search = driver.findElement(ser);
//		search.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		By shoes_xpath = By.xpath("//img[@alt=\"ASIAN Men's Wonder-13 Sports Running Shoes\"]");
		WebElement select_shoes = driver.findElement(shoes_xpath);
		select_shoes.click();
	}

}
