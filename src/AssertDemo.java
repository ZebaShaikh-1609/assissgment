import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
   @Test 
   public void assertDemo () {
	   String st1="Abc";
	   String st2="Abc";
	   Assert.assertEquals(st1, st2);//if both are not equal it will stop execution whereas in if else it ll continue with execution if both are not equals
	   System.out.println("Valid");
   }



}
