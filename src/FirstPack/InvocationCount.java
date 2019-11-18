package FirstPack;

import org.testng.annotations.Test;

public class InvocationCount {

		@Test(invocationCount=10)
		public void sum()
		{
			int a=10;
			int b=30;
			int c=a+b;
			System.out.println("a+b: "+c);
		}
	}

