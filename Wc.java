public class Wc{

	String text;
	public Wc(String str){
		this.text = str;
	}
	public int getChars(){
		return this.text.length();
	}

	public int getWords(){
		if(this.text.length() == 0) return 0;
		int lines = this.text.split("\r\n").length-1;
		String[] s1 = this.text.split(" ");
		return s1.length+lines;
	}

	public int getLine(){
		if(this.text.length() == 0) return 0;
		int result = this.text.split("\r\n").length;
		return result;
	}

	public String finalResult(){
		String output =  ""+getLine();
		output = output +" "+getWords();
		output = output +" "+ getChars();
		return output;
	}

	
	public static String giveResult(String str){
		Wc wcOutput = new Wc(str);
		return wcOutput.finalResult();
	}

}

