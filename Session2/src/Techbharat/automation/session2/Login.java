package Techbharat.automation.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://rahulshettyacademy.com/locatorspractice/";
		
		driver.get(url);
				
		String username = "Nikhil";
		
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		
		String password = "Nikhil@2608";
		
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		driver.findElement(By.className("submit")).click();
		
		Thread.sleep(2000);
		
		WebElement warning = driver.findElement(By.className("error"));
		
		String warningText = warning.getText();
		
		System.out.println(warningText);
		
		String textforfyp = "Forgot your password?";
		
		driver.findElement(By.linkText(textforfyp)).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		Thread.sleep(2000);
		
		WebElement passwordInfo = driver.findElement(By.className("infoMsg"));
		
		String passwordInfoText = passwordInfo.getText();
		
		System.out.println(passwordInfoText);
		
		String [] passwordBreak = passwordInfoText.split("'");
		
		System.out.println(passwordBreak[1]);
		
		driver.findElement(By.className("go-to-login-btn")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		
		driver.findElement(By.name("inputPassword")).sendKeys(passwordBreak[1]);
		
		driver.findElement(By.className("submit")).click();
		
		Thread.sleep(2000);
		
		WebElement helloText = driver.findElement(By.tagName("h2"));
		
		String hello = helloText.getText();
		
		System.out.println(hello);
		
		String[] helloArray = hello.split(" ");
		
		System.out.println(helloArray[1]);
		
		String [] actualNameArray = helloArray[1].split(",");
		
		System.out.println(actualNameArray[0]);
		
		System.out.println(actualNameArray[0].equals(username));
		
		driver.findElement(By.className("logout-btn")).click();
		
		System.out.println("Test Completed Successfully");
		
		
		driver.quit();

		

	}

}
