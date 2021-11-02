package Com.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClass 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
				
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
