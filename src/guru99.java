import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println("......Launching browser.........");
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		WebElement upload= driver.findElement(By.xpath("//div[@id='file_wraper0']"));
		upload.click();

	}
}
