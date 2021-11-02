package Com.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
	//id Locator
		driver.findElement(By.id("username")).sendKeys("Email");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("Login")).click();
		
		//LinkText Locator
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot Your Password?")).click(); 
		
		

	}

}

//Homework: PartialLinkText, classname, tagname

