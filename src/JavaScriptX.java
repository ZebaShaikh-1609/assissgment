import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptX {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(10000);
        driver.get("http://www.facebook.com/");
		Thread.sleep(10000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(500,0)");   // for x axis

		


}
}