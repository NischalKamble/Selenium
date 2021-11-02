package Com.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCss {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demouser");   //xpath
		
		Thread.sleep(2000);
	/*	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Nischal");   //css selector
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[id='Login']")).click(); */
		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("User1");	
		//driver.findElement(By.partialLinkText("Use Custom")).click();
		
		/*parentChild Traverser*/
		driver.findElement(By.xpath("//div[@id='username_container']//input")).sendKeys("Nischal");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//a[contains(text(),'Forgot Your Password')]")).click();
		
		
		
	}

}

/* xpath syntax:  //tagname[@atrribute=value] 
 
 *css selector syntax: tagname[atrribute=value]
 *
 *parentChild Traverser:
 *xpath syntax:   //parentTagname[@parentAttribute='value']//childTagName
 *
 //Absolute Xpath --it uses complete path from root element---parent-child

//Relative xpath--You can simply start by referencing the element you want and go from there.---

 * // Relative Xpaths are always preferred as they are not the complete paths from the root element
 
 *syntax contains xpath:   //a[contains(text(),'Try for Free')]
 */









