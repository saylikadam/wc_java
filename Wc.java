public class Wc{

	public int getLength(String str){
		return str.length();
	}

	public int getWords(String str){
		if(str.length() == 0) return 0;
		int lines = str.split("\r\n").length-1;
		String[] s1 = str.split(" ");
		return s1.length+lines;
	}

	public int getLine(String str){
		if(str.length() == 0) return 0;
		int result = str.split("\r\n").length -1;
		return result;
	}

//line word character
	public String finalResult(String str){
		String output =  ""+getLine(str);
		output = output +" "+getWords(str);
		output = output +" "+ getLength(str);
		return output;
	}

	//giving particular result for options

	public String giveParticular(String str,String option){
		if(option != null){
			switch(option){
			case "-c" : return ""+getLength(str);
			case "-l" : return ""+getLine(str);
			case "-w" : return ""+getWords(str);
			}	
		}
		return getLine(str) + " " + getWords(str) + " " + getLength(str);
	}

}

