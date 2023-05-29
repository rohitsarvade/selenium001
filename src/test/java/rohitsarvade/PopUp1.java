package rohitsarvade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Rohit Sarvade");
		driver.findElement(By.id("alertbtn")).click();

		// this SwitchTo methode is to jump from web page to google alerts
		System.out.println(driver.switchTo().alert().getText());

		// this is to accept the alert
		driver.switchTo().alert().accept();

		driver.findElement(By.id("name")).sendKeys("Rohit Sarvade");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		// this is to dissmiss the alert
		driver.switchTo().alert().dismiss();

	}

}
