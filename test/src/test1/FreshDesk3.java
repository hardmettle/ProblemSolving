package test1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class FreshDesk3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			int  testCases = Integer.parseInt(bufferRead.readLine());
			while(testCases != 0){
				int ctr = 0;
				String S = bufferRead.readLine().trim();
				int numOfSubStr = ((S.length()) * (S.length()+1))/2;
				Pattern pattern11 = Pattern.compile(" abc");
				Pattern pattern12 = Pattern.compile("acb");
				Pattern pattern21 = Pattern.compile("(?=(.*?bac.*))");
				Pattern pattern22 = Pattern.compile("bca");
				Pattern pattern31 = Pattern.compile("cab");
				Pattern pattern32 = Pattern.compile("cba");
				Pattern[] P = {pattern11,pattern12,pattern21,pattern22,pattern31,pattern32};
				for(int i = 0 ; i < P.length ; i++){
					Matcher matcher = P[i].matcher(S);
					while(matcher.find()){
						
						ctr++;
					}
				}
				
				System.out.println(numOfSubStr-ctr);
				testCases--;
			}
		}
		catch(IOException ex){
			ex.printStackTrace();
		}

	}

}
