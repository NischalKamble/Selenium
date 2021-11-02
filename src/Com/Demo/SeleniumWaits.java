package Com.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		

	}

}

//Implicit Wait : wait after every action. need to declare once only

//Explicit Wait : wait wherever we want to in script

//WebDriverWait wait = new WebDriverWait(driver,5);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

/*	Fluent Wait
Fluent Wait in Selenium is used to define maximum  for the web driver to wait for a condition,
as well as the frequency with which we want to check the condition before throwing 
an "ElementNotVisibleException" exception. 
It checks for the web element at regular intervals until the object is found or timeout happens.*/
/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
		.withTimeout(30, TimeUnit.SECONDS) 			
		.pollingEvery(5, TimeUnit.SECONDS */

