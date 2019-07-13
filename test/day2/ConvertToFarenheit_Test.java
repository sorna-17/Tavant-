package day2;
import static org.junit.Assert.*;
import org.junit.Test;
public class ConvertToFarenheit_Test {

	@Test
	public void Farenheittest() {
		Temperature junit = new Temperature();
		double result = junit.ConvertToFarenheit(25);
		double expected = 77.0;
		double delta = 0;
		assertEquals( expected,  result,  delta);
		
	 }
}
