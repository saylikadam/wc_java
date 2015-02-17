import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{
	@Test
	public void canGiveLengthOfString(){
		Wc w = new Wc("hello");
		assertEquals(5,w.getLength());
	}
}