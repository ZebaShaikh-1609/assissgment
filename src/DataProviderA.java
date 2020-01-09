import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderA {
	
	@DataProvider
	public String[][] getData() {
	String[] [] data= new String[3][2];
	
	  data[0][0]="User A";
	  data[0][1]="A1";
	  
	  data[1][0]="User B";
	  data[1][1]="B1";
	  
	  data[2][0]="User C";
	  data[2][1]="C1";
	  
	  return data;
	}
    @Test(dataProvider="getData")
    public void createUser(String un, String pw){
    Reporter.log("create:"  + un + "pwd:" + pw ,true);
	  
}  
}
