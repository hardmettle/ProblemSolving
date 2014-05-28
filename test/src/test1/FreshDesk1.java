package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FreshDesk1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
				BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
				int  testCases = Integer.parseInt(bufferRead.readLine());
				while(testCases != 0){
					long counter = 0 ;
					int N = Integer.parseInt(bufferRead.readLine());
					counter += N;
					String[] sArr = bufferRead.readLine().trim().split("\\s+");
					long[] iArr = new long[N];
					ArrayList<Long> lArrList = new ArrayList<Long>();
					int i = 0;
					long sum = 0 ;
					for(String s : sArr){
						
						iArr[i] = Long.parseLong(s);
						lArrList.add(Long.parseLong(s));
						sum += iArr[i];
						i++ ;
					}
					if(iArr[0]*N == sum){
						int tmp =  N - 1 ; 
						while(tmp != 0){
							counter += tmp ;
							tmp -- ;
						}
					}
					else{
						for(int p = 0 ; p < lArrList.size() ; p++ ){
							int tmpCtr = 0;
							for(int q = p+1 ; q < lArrList.size() ; q++){
								if(lArrList.get(p) == lArrList.get(q)){
									counter++;
									tmpCtr++;
									lArrList.remove(q);
								}
							}
							while(tmpCtr != 0){
								counter += tmpCtr;
								tmpCtr--;
							}
						}
					}
					testCases--;
					System.out.println(counter);
				}
			}
			catch(IOException ex){
				ex.printStackTrace() ;
			}
			 
	}
}
