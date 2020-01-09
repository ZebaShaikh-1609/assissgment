import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
		System.out.println("Suggestions");
		Actions a= new Actions (driver);
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));//parents path of sugg 
		for (WebElement sugg : suggestions) {
			System.out.println(sugg.getText());
			a.moveToElement(sugg).build().perform();
			Thread.sleep(1000);
		}
			System.out.println("Click and Print");
			WebElement option= driver.findElement(By.xpath("//span[contains(.,'script')]/b"));
			System.out.println(option.getText());
			option.click();
			Thread.sleep(1000);
		
			
		}
	}
	

