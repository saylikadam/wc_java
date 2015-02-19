import java.io.*;

class wcMain{
	public static void main (String[] args)throws IOException {
		String file = args[0];
		File newFile = new File(file);
		int len = (int)newFile.length();
		char cbuf[] = new char[len];
		BufferedReader br = new BufferedReader(new FileReader(newFile));
		br.read(cbuf,0,len);
		String text = new String(cbuf);
		String result = Wc.giveResult(text);
		System.out.println(result+"	"+file);

	}
}

