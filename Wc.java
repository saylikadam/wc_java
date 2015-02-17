public class Wc{
	String str;
	public Wc(String s){
		str = s;
	}

	public int getLength(){
		return str.length();
	}

	public int getWords(){
		String[] s1 = str.split(" ");
		return s1.length;
	}

	public int getLine(){
		String[] s1 = str.split("\r\n");
		return s1.length;
	}
}