package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateUser extends HomePage{
	
	@Test(priority=1)
	public void home()
		{
			Utility();
		}
	
	@Test(priority = 2)
	public void User()

	{	driver.findElement(By.xpath("//button[text()='Login']")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	String originalWindow = driver.getWindowHandle();
    for (String windowHandle : driver.getWindowHandles()) {
        if (!windowHandle.equals(originalWindow)) {
            driver.switchTo().window(windowHandle);
            break;
        }
    }
		driver.findElement(By.linkText("Create account")).click();
	}
}
