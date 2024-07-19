package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import framework.Utility;

public class LoginPage extends HomePage {
	@Test(priority = 1)
	public void Callmain() {
		Utility();
	}

	@Test(priority = 2)
	public void login() throws InterruptedException 
	{
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		handle();
		

		driver.findElement(By.xpath("//*[@id='policy_number']/div/input")).sendKeys("12345");
		Thread.sleep(5000);
	}
	

}
