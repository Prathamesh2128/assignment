package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends HomePage 
{
	@Test(priority = 1)
	public void Callmain() 
	{
		Utility();
	}

	@Test(priority = 2)
	public void payrenewal() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		handle();
		driver.findElement(By.xpath("//input[@placeholder='Enter Policy Number']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Ketan Patil");
		driver.findElement(By.xpath("//input[@placeholder='Enter Zip Code']")).sendKeys("4002165");

		driver.findElement(By.xpath("//button[text()='Review Premium']")).click();

//		String txtPayrenewal = driver.findElement(By.xpath("//div[text()='captcha not matched, please fill the captcha']")).getText();
//		System.out.println("txtPayrenewal >> " + txtPayrenewal);
//		String test = "captcha not matched, please fill the captcha";
		
//		WebElement outerDiv = driver.findElement(By.className("Toastify__toast-body"));
//		WebElement innerDiv = outerDiv.findElement(By.xpath(".//div[contains(text(), 'captcha not matched, please fill the captcha')]"));
//		String txtPayrenewal = innerDiv.getText();
//		System.out.println("txtPayrenewal >> " + txtPayrenewal);
//		
//		System.out.println(driver.findElement(By.xpath(".//div[contains(text(), 'Pay Renewal')]")).getText());
//		if (txtPayrenewal=="captcha not matched, please fill the captcha") {
//			System.out.println("captcha not matched.....");
//		} else {
//			System.out.println("Test case Failed");
//		}
		}

	@Test(priority = 3)
	public void claim() throws InterruptedException 
	{
		driver.findElement(By.className("bi-list-check")).click();
		driver.findElement(By.xpath("//button[text()='Continue with Claim']")).click();
		Thread.sleep(5000);

	}
	
	@Test(priority = 4)
	public void accesspolicy()
	{
		driver.findElement(By.className("bi-file-earmark-text")).click();
		driver.findElement(By.xpath("//input[@placeholder='Your Username']")).sendKeys("KetanPatil@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Your Password']")).sendKeys("Ketan@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
//		driver.findElement(By.linkText("Forgot Password")).click();
	}
	
	@Test(priority = 5)
	public void savedqoute()
	{
		driver.findElement(By.className("bi-file-earmark-text")).click();
		driver.findElement(By.xpath("//input[@placeholder='Your Username']")).sendKeys("KetanPatil@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Your Password']")).sendKeys("Ketan@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
}