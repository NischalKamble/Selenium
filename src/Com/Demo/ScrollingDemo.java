package Com.Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		//to scroll down the page
		js.executeScript("window.scrollBy(0,600 )");
		Thread.sleep(2000);
		
		//to scroll up on page
		js.executeScript("window.scrollBy(600,0 )");
		Thread.sleep(2000);
		
		//This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", "WebElement");

	}

}
