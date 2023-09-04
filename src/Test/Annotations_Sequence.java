package Test;

import org.testng.annotations.Test;

public class Annotations_Sequence {
	public class withOutPriority {
		
		@Test
		public void c() {
			System.out.println("In C method");
		}
		
		@Test
		public void b() {
			System.out.println("In B method");
		}
		
		@Test
		public void a() {
			System.out.println("In A method");
		}
	}
}
