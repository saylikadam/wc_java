public class Wc{

	public int getLength(String str){
		return str.length();
	}

	public int getWords(String str){
		if(str.length() == 0) return 0;
		String[] s1 = str.split(" ");
		return s1.length;
	}

	public int getLine(String str){
		if(str.length() == 0) return 0;
		String[] s1 = str.split("\r\n");
		return s1.length;
	}
}