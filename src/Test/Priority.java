package Test;

import org.testng.annotations.Test;

public class Priority {
	public class withPriority {
		
		@Test(priority = 1)
		public void c() {
			System.out.println("In C method");
		}
		
		@Test(priority = 2)
		public void b() {
			System.out.println("In B method");
		}
		
		@Test(priority = 3)
		public void a() {
			System.out.println("In A method");
		}
	}

}
