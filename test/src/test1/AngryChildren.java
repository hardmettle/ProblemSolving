package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AngryChildren {

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
			int minFair = NArr[K-1]-NArr[0];
			for(int i=1;i < N-K-1 ;i++){
				if(minFair > (NArr[i+K-1]-NArr[i])){
					minFair = NArr[i+K-1]-NArr[i];
				}
			}
			System.out.println(minFair);
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
