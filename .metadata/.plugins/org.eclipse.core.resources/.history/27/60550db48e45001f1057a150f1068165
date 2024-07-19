package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver= new ChromeDriver();

	@Test(priority = 1)
	 public void Utility() 
	{
		driver.get("https://farmers.uat.instantquote.odysseynext.com/?uuid=00002");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void handle()
	{
		 String originalWindow = driver.getWindowHandle();
		    for (String windowHandle : driver.getWindowHandles()) {
		        if (!windowHandle.equals(originalWindow)) {
		            driver.switchTo().window(windowHandle);
		            break;
		        }
		    }
	}
}
