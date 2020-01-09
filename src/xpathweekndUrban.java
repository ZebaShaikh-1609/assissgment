import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathweekndUrban {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.urbanladder.com/");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();//close popup
			Thread.sleep(10000);
			WebElement sale = driver.findElement(xpath(""));
            sale.click();

}
}