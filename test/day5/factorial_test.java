package day5;
import static org.junit.Assert.*;
import org.junit.Test;
public class factorial_test {

	@Test
	public void factorialtest() {
		Factorial Junit = new Factorial();
		int result = Junit.calculateFactorial(6);
		int expected = 720;
		assertEquals(expected,result);
	}
}

