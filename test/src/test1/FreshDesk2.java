package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FreshDesk2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			int  testCases = Integer.parseInt(bufferRead.readLine());
			while(testCases != 0){
				String[] sArr = bufferRead.readLine().trim().split("\\s+");
				long Z = Long.parseLong(sArr[0]);
				long M = Long.parseLong(sArr[1]);
				long N = Long.parseLong(sArr[2]);
				long ctr = 0;
				long i = 2 ;
				if(M >= 1 && Z <= N){
					ctr++ ;
				}
				if(Z <= M && N >= 1){
					ctr++ ;
				}
				//long half = Z / 2 ;
				while(Z > 1 ){
					if(Z % i == 0){
						if((i <= M && (Z / i) <= N )||(i <= M && (Z / i) <= N)){
							if(i == (Z / i)){
								ctr++;
							}
							else{
								ctr+=2 ;
							}
						}
						Z = Z / i;
						i++;
					}
					else{
						i++;
					}
				}
				System.out.println(ctr);
				testCases--;
			}
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
