package Com.Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\newFile.png");
		FileUtils.copyFile(src, dest);

	}

}


//((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//new File("C:\\Users\\bhagy\\screenshot.png")