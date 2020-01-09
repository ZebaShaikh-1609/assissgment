import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		System.out.println("...Launching Browser...");
		WebDriver driver = new ChromeDriver();//upcasting
		Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println("....Loading URL....");
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(2000);
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));//xpath for frame
        driver.switchTo().frame(frame);
        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));//x path for slider
       Actions a =new Actions (driver);
       a.dragAndDropBy(slider, 50, 0).perform();

	}

}
