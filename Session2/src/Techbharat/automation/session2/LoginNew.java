package Techbharat.automation.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginNew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		String url = "https://rahulshettyacademy.com/locatorspractice/";

		driver.get(url);

		String username = "nikhil";

		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(username);
		
		String password = "nikhil26";
		
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
//		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		
//		Thread.sleep(2000);
		
//		driver.findElement(By.linkText("Forgot your password?")).click();
		
//		driver.findElement(By.partialLinkText("Forgot your")).click();
		
		driver.findElement(By.xpath("//form/div/a[text() = 'Forgot your password?']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
