import org.testng.annotations.Test;

public class groupsDemo {

	@Test(groups = "smoke",priority = 3)//group is used to execute testcase of perticular group first
	public void Demo() {
		System.out.println("Hi");
	}
	
	
	@Test(groups = "functional",dependsOnGroups="smoke")
	public void Demo1 (){
		System.out.println("Hi1");
	}

	
	@Test(groups = "smoke",priority = 1)
	public void Demo2() {
		System.out.println("Hi2");
	}

	@Test(groups = "functional",dependsOnGroups="smoke")
	public void Demo3(){
		System.out.println("Hi3");
	}

	@Test(groups = "smoke",priority = 2)
	public void Demo4(){
		System.out.println("Hi4");
	}
	
	@Test(groups = "system",dependsOnGroups="functional")
	public void Demo5(){
		System.out.println("Hi5");
	}
	
}



