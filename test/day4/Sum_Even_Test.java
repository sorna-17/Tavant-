package day4;
import static org.junit.Assert.*;
import org.junit.Test;
public class Sum_Even_Test {

	@Test
	public void sum_Even_test() {
		SumOfNumbers jtest = new SumOfNumbers();
		int result = jtest.sumofEvenNumbers(2,4);
		int expected = 6;
		assertEquals(expected,result);
		
	}

}
