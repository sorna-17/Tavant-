package day3;
import static org.junit.Assert.*;
import org.junit.Test;
public class Grade_Test {

	@Test
	public void gradetest() {
		MarkValidator Unit = new MarkValidator();
		
		String result = Unit.markGrade(70);
		String expected = "C";
		assertEquals(expected,result);
	}

}
