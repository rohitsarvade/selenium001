package rohitsarvade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookmyShow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/pune");
//		sc-7o7nez-0 fNzwUg  sc-7o7nez-0 noqMC
		driver.findElement(By.className("noqMC")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='styles__CtaText-sc-1vmod7e-2 bBLrVT'])[1]")).click();

	}

}