import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testurbbanladder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='featuredLinksBar__link']/parent::span")).click();


		
		
		
		/*
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='featuredLinksBar__content']/descendant::li/a[contains(., 'Stores ')]")).click();
		Thread.sleep(1000);

		List<WebElement> Web=driver.findElements(By.xpath("//div[@class='12wcw']/descendant::h3"));
		Thread.sleep(1000);
        for (WebElement list : Web) {
	    System.out.println(list.getText());
     
        }
*/
	
	}
	
	

}