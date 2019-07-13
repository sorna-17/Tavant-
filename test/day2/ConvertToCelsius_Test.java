package day2;
import static org.junit.Assert.*;
import org.junit.Test;
public class ConvertToCelsius_Test {

	@Test
	public void Celsiustest() {
		Temperature junit = new Temperature();
		double result = junit.ConvertToCelsius(89.6);
		double expected = 32;
		double delta = 0;
		assertEquals( expected,  result,  delta);
	}

}
