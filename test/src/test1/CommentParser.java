package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class CommentParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader bufferedRdr = new BufferedReader(new InputStreamReader(System.in));
			String line = bufferedRdr.readLine();
			line = line.trim();
			Pattern p1 = Pattern.compile(".*?\\/\\/(.*)\\r?\\n");
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
