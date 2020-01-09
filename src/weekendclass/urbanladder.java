package weekendclass;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urbanladder {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//up casting
		driver.manage().window().maximize();//to maximize
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();//close pop-up
		Thread.sleep(1000);
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));//fetch menu text
		Actions a = new Actions(driver); 
		for (WebElement item : menus) {
			String name = item.getText();
			System.err.println(name); //err headings in red 
			a.moveToElement(item).perform();
			Thread.sleep(2000);
			List<WebElement> submenus = driver.findElements(
					By.xpath("//span[contains(.,'"+name+"')]/parent::li/descendant::ul[@class='inline-list left']"));//fetch submenu item by using concatination
			Thread.sleep(2000);
        for (WebElement subitems : submenus) {
	     System.out.println(subitems.getText());
}
			
			
		}
		System.out.println(menus.getClass());//return type is array list which is uypcasted to list coz methos can't return interface
}

}
