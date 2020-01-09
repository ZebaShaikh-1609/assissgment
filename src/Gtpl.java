import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gtpl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v1/index.php");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        login.click();
        Alert a = driver.switchTo().alert();
        Thread.sleep(3000);
        System.out.println(a.getText());
        a.accept();
        
}
}