

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		WebElement close=driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		close.click();
		/*Thread.sleep(1000);
		WebElement e1 = driver.findElement(By.xpath("//li/span[contains(.,' Decor')]"));
		System.out.println(e1.getText());*/
		
		//List<WebElement> menu= driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		//for (WebElement item : menu) {
			//System.out.println(item.getText());
			
		//}
		
		
	}
}
