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
		int result = this.text.split("\r\n").length -1;
		return result;
	}

//line word character
	public String finalResult(){
		String output =  ""+getLine();
		output = output +" "+getWords();
		output = output +" "+ getChars();
		return output;
	}

	//giving particular result for options

	public String isOption(String option){
		if(option != null){
			switch(option){
			case "-c" : return ""+getChars();
			case "-l" : return ""+getLine();
			case "-w" : return ""+getWords();
			}	
		}
		return finalResult();
	}

}

