import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Javabygoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		WebElement java=driver.findElement(By.xpath("//div[@class='kno-ecr-pt PZPZlf gsmt']/span[contains(.,'Java')]"));
		Actions a = new Actions (driver);
		a.doubleClick(java).perform();
		

		

	}

}
