package Com.Demo;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkboxHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//to select multiple checkbox
		//List<WebElement> obj=driver.findElements(By.xpath("//input[@type='checkbox']"));
		/*To select all element from checkbox
		 * System.out.println(obj.size());
		for(WebElement element:obj)
		{
			element.click();
		}*/
		/* To select single element from checkbox
		 
		 for(WebElement element:obj)
		{
			if(element.getAttribute("value").equalsIgnoreCase("option2"))
			{
				element.click();
				break;
			}
			
		}*/
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		//driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
		WebElement element=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		System.out.println("Selected:"+element.isSelected());
		System.out.println("Enabled:"+element.isEnabled());
		System.out.println("Displayed:"+element.isDisplayed());
			
	}

}
