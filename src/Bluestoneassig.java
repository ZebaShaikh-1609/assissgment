import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestoneassig {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebElement monthlyplan= driver.findElement(By.xpath("//li[@class='menuparent repb nav-goldmine-link']"));
        monthlyplan.click();
        driver.findElement(By.xpath("//input[@id='gmsStart']")).click();
		WebElement amterrormsg= driver.findElement(By.xpath("//li[contains(.,'Amount is required')]"));
		System.out.println(amterrormsg.getText());
		WebElement emailerrormsg= driver.findElement(By.xpath("//li[contains(.,'Email is required')]"));
		System.out.println(emailerrormsg.getText());
        driver.close();
        

	}

}
