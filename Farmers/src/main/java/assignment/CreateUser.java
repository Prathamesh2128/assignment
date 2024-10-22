package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateUser extends HomePage{
	
	@Test(priority=1)
	public void home()
		{
			Utility();
			handle();
		}
	
	@Test(priority = 2)
	public void singUp()

	{	
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		handle();
		driver.findElement(By.linkText("Create account")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Policy Number Or Quote Number']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@placeholder='Enter Zip Code']")).sendKeys("400203");
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
	}
}
