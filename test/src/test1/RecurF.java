package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecurF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X , Y , N;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String[] line = br.readLine().split(" ");
	         X = Integer.parseInt(line[0]);
	         Y = Integer.parseInt(line[1]);
	         N = recF(X,Y);
	         System.out.println(N % 1000);
	         
		}catch(IOException ex){
			ex.printStackTrace();
		}

	}
	public static int recF(int x, int y){
		if(x == 0){
			return y+1;
		}else{
			if(x >0 && y == 0){
				return recF(x-1 , 1);
			}
			else{
					return recF(x - 1, recF(x, y - 1));
			}
		}
		
	}

}
