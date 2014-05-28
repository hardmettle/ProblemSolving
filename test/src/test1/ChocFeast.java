package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChocFeast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(bufferRead.readLine());
			int numOfChocs=0;
			while(T > 0){
				String[] NCM = bufferRead.readLine().split(" ");
				int N = Integer.parseInt(NCM[0]);
				int C = Integer.parseInt(NCM[1]);
				int M = Integer.parseInt(NCM[2]);

				numOfChocs = N/C;
				if(numOfChocs < M){
					System.out.println(numOfChocs);
				}else if(numOfChocs == M){
					System.out.println(numOfChocs+1);
				}else{
					numOfChocs += returnChocs(numOfChocs,M);
					System.out.println(numOfChocs);
					
				}
				T--;
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
	public static int returnChocs(int total,int M){
		int spareChoc = 0;
		int multOfMChoc = 0;
		int chocCtr = 0;
		if(total < M){
			return chocCtr;
		}
		spareChoc = total%M;
		multOfMChoc = total-spareChoc;
		chocCtr += multOfMChoc/M;
		chocCtr += returnChocs(chocCtr+spareChoc, M);
		return chocCtr;
	}
}
