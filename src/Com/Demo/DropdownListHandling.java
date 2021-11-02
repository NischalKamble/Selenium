package Com.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropdownListHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
		Thread.sleep(2000);
		
		List<WebElement> element=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		/*Select s=new Select(element3);
		s.selectByValue("option1");
		*/
		System.out.println(element.size());
		
		for(WebElement i:element)
		{
			if(i.getText().equalsIgnoreCase("INDIA"))
			{
				i.click();
				break;
			}
		}
		
	}

}
