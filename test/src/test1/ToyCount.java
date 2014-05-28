package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ToyCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			    System.out.println("Enter the N & K :::: ");
			    //String NK = bufferRead.readLine();
			    String[] NKArr = bufferRead.readLine().split(" ");
			    long N = Long.parseLong(NKArr[0]);
			    long K = Long.parseLong(NKArr[1]);
			    System.out.println("Enter the number of Prices :::: ");
			    //String priceString = bufferRead.readLine();
			    String[] strArr = bufferRead.readLine().split(" "); 
			    long[] priceArr = new long[(int) (N)] ;
			    for(int i =0 ; i < N ; i++){
			    	priceArr[i] = Long.parseLong(strArr[i]);
			    }
			    long numOfToys = 0;
			    int t=0;
			    Arrays.sort(priceArr);
			    while(K >= 0){
			    	K= K-priceArr[t];
			    	numOfToys++;
			    	t++;
			    }
			    System.out.println(numOfToys-1);
			    
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
