package Com.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions a=new Actions(driver);
		WebElement home=driver.findElement(By.xpath("//button[contains(text(),'Home')]"));
		Thread.sleep(5000);
		a.contextClick(home).perform();
		a.doubleClick(home).perform();
		

	}

}
