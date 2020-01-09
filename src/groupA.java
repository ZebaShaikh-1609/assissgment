import org.testng.annotations.Test;

public class groupA {
	
	@Test(dependsOnMethods="Demo2")
	public void Demo (){
		System.out.println("Hi");
	}

	
	@Test()
	public void Demo1() {
		System.out.println("Hi1");
	}

	@Test(dependsOnMethods="Demo1")
	public void Demo2(){
		System.out.println("Hi2");
	}

	@Test() //after demo it ll print coz first all will execute than it will check for dependent
	public void Demo3(){
		System.out.println("Hi3");
	}


}
