package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailingZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 0;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	         N = Integer.parseInt(line);
		}catch(IOException ex){
			ex.printStackTrace();
		}
			int ctr = 0;
			ctr += ((N/10)*2);
			if(N % 10 !=0 && N %10 >= 5){
				 ctr++;
			}
	       
	        System.out.println(ctr);
    }
}
