import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class flipkartiphone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("...........Launching browser.............");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(1000);
		WebElement ip=driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		ip.sendKeys("iphone");
		Actions a =new Actions(driver);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='col-12-12 _2tVp4'j]"));
		for (WebElement sugg : suggestions) {
			System.out.println(sugg.getText());
			a.moveToElement(sugg).build().perform();
			Thread.sleep(1000);
		}
			/*System.out.println("Click and Print");
			WebElement option= driver.findElement(By.xpath("//span[contains(.,'script')]/b"));
			System.out.println(option.getText());
			option.click();
			Thread.sleep(1000);*/
		
	   
			
		}
	
		}	
