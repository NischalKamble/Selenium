package Com.Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		//It will return Parent and child window
		Set<String> window=driver.getWindowHandles();
		
		Iterator<String> a=window.iterator();
		
		String parentWindow=a.next();
		String childWindow=a.next();
		
		driver.switchTo().window(childWindow);  //To switch control on child window
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		
		driver.switchTo().window(parentWindow);  //To switch control on parent window
		
		driver.findElement(By.xpath("//input[@name='radioButton']")).click();	
		
		
	}

}

/*get.windowhandle(): This method helps to get the window handle of the current window
get.windowhandles(): This method helps to get the handles of all the windows opened
set: This method helps to set the window handles in the form of a string. set<string> set= driver.get.windowhandles()
switch to: This method helps to switch between the windows
action: This method helps to perform certain actions on the windows */