package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GoodArr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 	Map<String,Integer> wrdMap = new HashMap<String,Integer>();
				try{
				    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
				    System.out.println("Enter the sentece :::: ");
				    String sent = bufferRead.readLine();
				    System.out.println("Enter the number of keywords :::: ");
				    int numOfKey = Integer.parseInt(bufferRead.readLine());
				    System.out.println("Start entering the keywords :::: ");
				    while(numOfKey != 0){
				    	wrdMap.put(bufferRead.readLine(), 0);
				    	numOfKey--;
				    }
				    System.out.println(sent);
				    
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}

	}
}
