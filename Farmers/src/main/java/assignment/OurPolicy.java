package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OurPolicy extends HomePage
{	
	@Test(priority = 1)
	public void calling() 
	{
		Utility();
		
		driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
//		handle();	
	}
	
//	@Test(priority = 2)
//	void policy()
//	{
//		
//		driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		handle();
//		
//	}
}
