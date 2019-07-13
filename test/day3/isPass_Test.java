package day3;
import static org.junit.Assert.*;
import org.junit.Test;
public class isPass_Test {

	@Test
	public void Passtest() {
		MarkValidator JUnit = new MarkValidator();
		boolean result = JUnit.isPass(80);
		boolean expected = true;
		assertEquals(expected,result);
		}

}
