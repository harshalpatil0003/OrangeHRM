package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	public  void main() {
		String Expected_data="Harshal";
		String Actual_data="Harshal";
		
		assertEquals(Actual_data,Expected_data,"TestCase Fail");
		System.out.println("Objects are equal");
	}
}

