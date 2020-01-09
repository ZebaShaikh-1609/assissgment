import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderGmail {
	@DataProvider
	public String[][] getData() {
	String[] [] data= new String[3][2];
	
	  data[0][0]="User A@gmail.com";
	  data[0][1]="A1";
	  
	  data[1][0]="User B@gmail.com";
	  data[1][1]="B1";
	  
	  data[2][0]="User C@gmail.com";
	  data[2][1]="C1";
	  
	  return data;
	}
    @Test(dataProvider="getData")
    public void createUser(String un, String pw){
    Reporter.log("create:"  + un + "pwd:" + pw ,true);
	System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://gmail.com/");
	WebElement id = driver.findElement(By.id("identifierId"));
	id.sendKeys(un);
	driver.findElement(By.id("identifierNext")).click();
	WebElement pwd = driver.findElement(By.name("password"));
	pwd.sendKeys(pw,Keys.ENTER);  
	driver.close();
}  




}
