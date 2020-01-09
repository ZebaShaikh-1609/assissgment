import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hindi {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.name("q"));//.sendKeys("हिन्दी");
		driver.findElement(By.xpath("//a[contains(.,'हिन्दी')]"));

		Thread.sleep(1000);
		System.out.println("......Suggestions........");
		//driver.findElement(By.xpath("//a[contains(.,'हिन्दी')]"));
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Actions a= new Actions (driver);
		Thread.sleep(2000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));//parents path of sugg 
        for (WebElement sugg : suggestions) {
			System.out.println(sugg.getText());
			a.moveToElement(sugg).build().perform();
			Thread.sleep(1000);
         }
			System.out.println(".....Click and Print.....");
			WebElement option= driver.findElement(By.xpath("//span[text()='हिन्दी']"));
			System.out.println(option.getText());
			option.click();
			Thread.sleep(1000);
	}
}
