package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void softAssert() {
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("softAssert method was started");
		softAssertion.assertTrue(false);
		System.out.println("softAssert method was executed");
			
	}
	
	@Test
	public void hardAssert() {
		System.out.println("hardAssert method was started");
		Assert.assertTrue(false);
		System.out.println("hardAssert method was executed");
			
	}

}
