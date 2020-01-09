import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	   public void assertDemo () {
		List lst1 = new ArrayList();
		lst1.add("Abc");
		lst1.add("Abd");
		lst1.add(9);
		
		List lst2 = new ArrayList();
		lst2.add("Abc");
		lst2.add("Abd");
		lst2.add(9);
		
		SoftAssert sa = new SoftAssert();
	    sa.assertEquals(lst1, lst2);
		System.out.println("Valid");
		sa.assertAll();   //it is used to print the report actual matches to expected


	}

}
