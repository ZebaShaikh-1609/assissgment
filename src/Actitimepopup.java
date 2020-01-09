import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimepopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(5000);
		WebElement icon = driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']/div[@class='popup_menu_icon']"));
		icon.click();
		driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
		Thread.sleep(2000);
		WebElement txt = driver.findElement(By.xpath("//span[contains(.,'© 2019 actiTIME Inc. All rights reserved.')]"));
        System.out.println(txt.getText());

		
		
	}
}
