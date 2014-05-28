package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class KoaneEye {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			
			int counter = 6;
			ArrayList<String> arrList = new ArrayList<String>();
			while(counter != 0){
				String line = bufferRead.readLine();
				StringBuffer sb = new StringBuffer(line);
				arrList.add(sb.reverse().toString());
				counter--;
				
			}
			Collections.reverse(arrList);
			for(int i = 0;i < 6 ; i++){
				System.out.println(arrList.get(i));
			}
		}
		catch(IOException Ex){
			Ex.printStackTrace();
		}
	}

}
