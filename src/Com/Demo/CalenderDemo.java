package Com.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions/");
		//driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='travel_date']"))).click();
		
		List<WebElement> element=driver.findElements(By.xpath("//td[@class='day']"));
		
		for(int i=0;i<element.size();i++)
		{
			String value=element.get(i).getText();
			if(value.equalsIgnoreCase("26"))
			{
				element.get(i).click();
				break;
			}
		}
	}

}
