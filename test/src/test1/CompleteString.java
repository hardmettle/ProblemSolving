package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class CompleteString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int N = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	         N = Integer.parseInt(line);
	         String str = null;
	         while(N !=0){
	        	 str = br.readLine();
	        	HashMap<Character, Boolean> cbMap = new HashMap<Character,Boolean>();
	        	 if(str.length() == 26){
	        		 char[] cArr = str.toCharArray();
	        		 for(int i = 0 ; i < 26 ; i++){
	        			 if(cbMap.containsKey(cArr[i]) == false){
	        				 cbMap.put(cArr[i], true); 
	        			 }
	        			 else{
	        				 System.out.println("NO");
	        				 break;
	        			 }
	        			 
	        		 }
	        		 if(cbMap.size() == 26){
	        			 System.out.println("YES");
	        		 }
	        	 }
	        	 else{
	        		 System.out.println("NO");
	        	 }
	        	 N--;	
	         }
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
