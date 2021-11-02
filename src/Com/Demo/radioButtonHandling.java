package Com.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> obj2=driver.findElements(By.xpath("//input[@type='radio']"));
		//System.out.println(obj2.size());
		for(WebElement element2:obj2)
		{
			Thread.sleep(2000);
			element2.click();
		}
		
		

	}

}
