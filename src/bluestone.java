import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(1000);
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions a = new Actions (driver);
		Thread.sleep(200);
		for (WebElement item : menu) {
			a.moveToElement(item).build().perform();
			Thread.sleep(1000);
			System.out.println(item.getText());
		//	WebElement submenu=driver.findElements(By.xpath("//ul/li[@class='first']/a")).click();
			
			
			
		
		
		}
		
		
	}

}
