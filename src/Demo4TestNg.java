import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(DemoList.class)

public class Demo4TestNg {
     @Test
     public void Demo() {
    	 System.out.println("Hi");	 
     }
     
     @Test
     public void Demo2() {
    	 System.out.println("Hi2");
    	 Assert.fail(); 
     } 
     
     @Test
     public void Demo3() {
    	 System.out.println("Hi3");
    	 Assert.fail(); 
     }
}
