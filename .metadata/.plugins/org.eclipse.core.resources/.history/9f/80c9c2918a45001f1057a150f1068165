package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Language extends HomePage
{
	@Test(priority=1)
	public void Call()
		{
			Utility();
		}
	
	@Test(priority = 2)
	public void changelang()
	{
//		Select lang= new Select(driver.findElement(By.xpath("//span[@class='select-lng-span']")));
		driver.findElement(By.xpath("//span[@class='select-lng-span']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Spanish']")).click();
//		lang.selectByVisibleText("Spanish");
	}
}
