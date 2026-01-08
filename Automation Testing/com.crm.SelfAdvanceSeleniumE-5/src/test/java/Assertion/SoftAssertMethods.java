package Assertion;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertMethods {
	
	@Test
	public static void main() {
		String program="Java";
		String fire ="Lava";
		
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(program, fire,"Failure is happened due to comparison");
		Reporter.log("Going to next step", true);
		soft.assertAll();
		
	}
}
