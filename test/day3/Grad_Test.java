package day3;
import static org.junit.Assert.*;
import org.junit.Test;
public class Grad_Test {

	@Test
	public void Grad_test() {
        MarkGrade Unit = new MarkGrade();
		
		String result = Unit.markGrad(90);
		String expected = "A";
		assertEquals(expected,result);
	}

}
