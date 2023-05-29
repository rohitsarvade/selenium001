package rohitsarvade;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
        // implicit wait of 5 secs after webDriver 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		String Password=getPassword(driver);
		Locators2 b=new Locators2();
		String Password= b.getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String name= "Rohit";
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name+",");
		driver.findElement(By.className("logout-btn")).click();
		driver.close();
	}
	
	public  String getPassword(WebDriver driver) throws InterruptedException 
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		String[] passarray=passwordText.split("'");
		String Password=passarray[1].split("'")[0];
		return Password;
		
		
		
		
	}

}
