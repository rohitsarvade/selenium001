package rohitsarvade;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowActivity {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
			driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
			driver.navigate().back();
			driver.navigate().forward();
			
		

	}

}
