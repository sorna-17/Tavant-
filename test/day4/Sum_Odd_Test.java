package day4;
import static org.junit.Assert.*;
import org.junit.Test;
public class Sum_Odd_Test {

	@Test
	public void sum_odd_test() {
		SumOfNumbers jtest = new SumOfNumbers();
		int result = jtest.sumofOddNumbers(20,25);
		int expected = 69;
		assertEquals(expected,result);
	}

}

