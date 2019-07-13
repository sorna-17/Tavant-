package day1;
import static org.junit.Assert.*;
import org.junit.Test;
public class Hello_world_test {
             @Test
	public void hello_world_test() {
		hello_world hello_world = new hello_world();
		String result = hello_world.Get_Message("Hello World");
		assertEquals("Hello World",result);
	}

}
