import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_FizzBuzz {
	
	@Test
	void intToString() {
		Main main = new Main();
		
		assertEquals("3", main.intToString(3));
		assertEquals("6", main.intToString(6));
		assertEquals("9", main.intToString(9));
	}
	
	@Test
	void FizzBuzz() {
		Main main = new Main();
		
		assertEquals("Fizz", main.checkFizzBuzz(3));
		assertEquals("Buzz", main.checkFizzBuzz(5));
		assertEquals("FizzBuzz", main.checkFizzBuzz(15));
		assertEquals("4", main.checkFizzBuzz(4));
	}
}
