
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemoA {
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
		
		Assert.assertEquals(lst1, lst2);
		System.out.println("Valid");


	}
	   }

		