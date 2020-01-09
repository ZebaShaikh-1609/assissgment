package weekendclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

  public class googledoubleclick {
	  public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Actions a = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		WebElement ele = driver.findElement(By.xpath("//div[@class='kno-ecr-pt PZPZlf gsmt']/span"));
		a.doubleClick(ele).perform();


}
}