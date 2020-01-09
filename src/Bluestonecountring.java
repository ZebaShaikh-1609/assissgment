import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestonecountring {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(1000);
		WebElement ring = driver.findElement(By.xpath("//a[@title='Rings']/parent::li[@class='menuparent repb']"));
		Actions a = new Actions (driver);
		a.moveToElement(ring).build().perform();
		Thread.sleep(200);

		
		
	}
}
