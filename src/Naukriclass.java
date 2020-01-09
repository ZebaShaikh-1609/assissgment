import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Naukriclass{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("http://www.nauKri.com/");
		//System.out.println("loading url");
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		//System.out.println(driver.getTitle());
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> wins = driver.getWindowHandles();
		
		//to close in sequence
		//wins.remove(parent);
		//for (String win : wins) {
		//System.out.println(win);
		//driver.switchTo().window(win);
		//driver.close();}
		//driver.quit();
		
		//to close in reverse sequence
		System.out.println(wins.getClass());
		ArrayList<String> al = new ArrayList<>(wins);
		for (int i = al.size()-1;i>=0;i--) {
			driver.switchTo().window(al.get(i)).close();
		}
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
	}


