package WebdriverBasics;

import org.testng.annotations.Test;

public class TestNGPriorityConcept {

	@Test(priority=1)
	public void a()
	{
		System.out.println("a");
	}
	@Test
	public void b()
	{
		System.out.println("b");
	}
	@Test(priority=2)
	public void c()
	{
		System.out.println("c");
	}
	@Test
	public void d()
	{
		System.out.println("d");
	}
	
}
