package Com.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		//To print Alert Message
		System.out.println(driver.switchTo().alert().getText());  
		
		

	}

}
