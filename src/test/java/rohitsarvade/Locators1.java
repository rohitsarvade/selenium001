package rohitsarvade;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
        // implicit wait of 5 secs after webDriver 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//diff types of locators:- id, xpath, css selector, class name, tag name, link text, partial link text
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		//below is CSS selector=> tagname.classname, tagname#id, tagname[attribute='value']
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//use thread for a wait in JAVA
		Thread.sleep(1000);
		//this is xpath locator
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rohit");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rohit@sa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("rohit@gmail.com");
		
		//another way of writing xpath using '//parantTagName/childTagName'
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9087654321");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//another way of writing CSS using 'parantTagName childTagName'
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rohit");
		//if few values changes dynamically then use below locater for css
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("chkboxOne")).click();
		//if few values changes dynamically then use below locater for xpath
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
	}

}
