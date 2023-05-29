package rohitsarvade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Rohit Sameer Sarvade");
		driver.findElement(By.name("email")).sendKeys("rohit@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticDrop= driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropd=new Select(staticDrop);
		dropd.selectByIndex(0);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("25101997");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("alert-success")).getText());

	}

}
