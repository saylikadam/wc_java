import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{
	@Test
	public void canGiveLengthOfString(){
		String text = "hello";
		Wc w = new Wc();
		assertEquals(5,w.getLength(text));
	}

	@Test
	public void itCanGiveLengthOfStringWithSpaces(){
		String text = "India is my country";
		Wc w = new Wc();
		assertEquals(19,w.getLength(text));
	}

	@Test
	public void canGiveNoOfWordsInAString(){
		String text = "India is my country";
		Wc w = new Wc();
		assertEquals(4,w.getWords(text));
	}

	@Test
	public void canGiveNoOflinesInString(){
		String text = "India is my country";
		Wc w = new Wc();
		assertEquals(1,w.getLine(text));
	}

	@Test
	public void getLines_gives_0_for_empty_string (){
	   String text = "";
	   Wc wc = new Wc();
	   assertEquals(0,wc.getLine(text));
	}

	@Test
	public void getLines_gives_1_for_string_with_space (){
	   String text = " ";
	   Wc wc = new Wc();
	   assertEquals(1,wc.getLine(text));
	}

	@Test
	public void getLines_gives_2_for_two_lines_present_in_a_string (){
	   String text = "hello, this is a good day.\r\nWhat do you think?\r\n";
	   Wc wc = new Wc();
	   assertEquals(2,wc.getLine(text));
	}

	@Test
	public void getWords_gives_0_for_no_words_in_a_string (){
	   String text = "";
	   Wc wc = new Wc();
	   assertEquals(0,wc.getWords(text));
	}

	@Test
	public void getWords_gives_1_for_space_in_a_string (){
	   String text = " ";
	   Wc wc = new Wc();
	   assertEquals(0,wc.getWords(text));
	}

	@Test
	public void getWords_gives_1_for_one_word_in_a_string (){
	   String text = "Hello";
	   Wc wc = new Wc();
	   assertEquals(1,wc.getWords(text));
	}

	@Test
	public void getChars_gives_0_for_empty_string (){
	   String text = "";
	   Wc wc = new Wc();
	   assertEquals(0,wc.getLength(text));
	}

	@Test
	public void getChars_gives_5_for_hello (){
	   String text = "hello";
	   Wc wc = new Wc();
	   assertEquals(5,wc.getLength(text));
	}

	@Test
	public void getChars_gives_19_for_hello_How_are_you (){
	   String text = "hello, How are you?";
	   Wc wc = new Wc();
	   assertEquals(19,wc.getLength(text));
	}

	@Test
	public void getChars_gives_48_for_hello_How_are_you (){
	   String text = "hello, this is a good day.\r\nWhat do you think?\r\n";
	   Wc wc = new Wc();
	   assertEquals(2,wc.getLine(text));
	}
}