import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{
	@Test
	public void can_give_length_of_string(){
		String text = "hello";
		Wc w = new Wc(text);
		assertEquals(5,w.getChars());
	}

	@Test
	public void it_can_give_length_of_string_with_spaces(){
		String text = "India is my country";
		Wc w = new Wc(text);
		assertEquals(19,w.getChars());
	}

	@Test
	public void can_give_no_of_words_in_a_string(){
		String text = "India is my country";
		Wc w = new Wc(text);
		assertEquals(4,w.getWords());
	}

	@Test
	public void can_give_no_of_lines_in_string(){
		String text = "India is my country";
		Wc w = new Wc(text);
		assertEquals(1,w.getLine());
	}

	@Test
	public void getLines_gives_0_for_empty_string (){
	   String text = "";
	   Wc wc = new Wc(text);
	   assertEquals(0,wc.getLine());
	}

	@Test
	public void getLines_gives_1_for_string_with_space (){
	   String text = " ";
	   Wc wc = new Wc(text);
	   assertEquals(1,wc.getLine());
	}

	@Test
	public void getLines_gives_2_for_two_lines_present_in_a_string (){
	   String text = "hello, this is a good day. \r\nWhat do you think?\r\n";
	   Wc wc = new Wc(text);
	   assertEquals(2,wc.getLine());
	}

	@Test
	public void getWords_gives_0_for_no_words_in_a_string (){
	   String text = "";
	   Wc wc = new Wc(text);
	   assertEquals(0,wc.getWords());
	}

	@Test
	public void getWords_gives_1_for_space_in_a_string (){
	   String text = " ";
	   Wc wc = new Wc(text);
	   assertEquals(0,wc.getWords());
	}

	@Test
	public void getWords_gives_1_for_one_word_in_a_string (){
	   String text = "Hello";
	   Wc wc = new Wc(text);
	   assertEquals(1,wc.getWords());
	}

	@Test
	public void getChars_gives_0_for_empty_string (){
	   String text = "";
	   Wc wc = new Wc(text);
	   assertEquals(0,wc.getChars());
	}

	@Test
	public void getChars_gives_5_for_hello (){
	   String text = "hello";
	   Wc wc = new Wc(text);
	   assertEquals(5,wc.getChars());
	}

	@Test
	public void getChars_gives_19_for_hello_How_are_you (){
	   String text = "hello, How are you?";
	   Wc wc = new Wc(text);
	   assertEquals(19,wc.getChars());
	}

	@Test
	public void getChars_gives_48_for_hello_How_are_you (){
	   String text = "hello, this is a good day.\r\nWhat do you think?\r\n";
	   Wc wc = new Wc(text);
	   assertEquals(48,wc.getChars());
	}
	
	@Test
	public void finalResult_will_give_the_words_line_and_character_count(){
		String text = "hello, this is a good day.\r\nWhat do you think?\r\n";
		Wc wc = new Wc(text);
	    assertEquals("2 10 48",wc.finalResult());	
	}

}