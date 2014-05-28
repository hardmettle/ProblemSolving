package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AngryChildren2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(bufferedReader.readLine());
			int K = Integer.parseInt(bufferedReader.readLine());
			int[] NArr = new int[N];
			int ctr = 0;
			while(ctr < N){
				NArr[ctr] = Integer.parseInt(bufferedReader.readLine());
				ctr++;
			}
			Arrays.sort(NArr);
			int minFair = giveMin(Arrays.copyOfRange(NArr, 0, K));
			for(int i=1;i <= N-K ;i++){
				int tmp = giveMin(Arrays.copyOfRange(NArr,i,i+K));
				if(minFair > tmp){
					minFair = tmp;
				}
			}
			System.out.println(minFair);
		}catch(IOException e){
			e.printStackTrace();
		}

	}
	public static int giveMin(int[] A){
		int sum =0;
		for(int i = A.length-1 ; i>=0 ; i--)
		  {
		    sum += (A[i]*(i) - A[i]*(A.length-i-1));
		  }
		return sum;
	}

}
