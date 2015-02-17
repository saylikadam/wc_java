import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{
	@Test
	public void canGiveLengthOfString(){
		Wc w = new Wc("hello");
		assertEquals(5,w.getLength());
	}

	@Test
	public void itCanGiveLengthOfStringWithSpaces(){
		String s1 = "India is my country";
		Wc w = new Wc(s1);
		assertEquals(19,w.getLength());
	}

	@Test
	public void canGiveNoOfWordsInAString(){
		String s1 = "India is my country";
		Wc w = new Wc(s1);
		assertEquals(4,w.getWords());
	}

	@Test
	public void canGiveNoOflinesInString(){
		String s1 = "India is my country";
		Wc w = new Wc(s1);
		assertEquals(1,w.getLine());
	}
}