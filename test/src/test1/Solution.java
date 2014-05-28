package test1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(bufferRead.readLine());
			int[][] COST = new int[N][N];
			int[][] MANG = new int[N][N];
			int expectedEdges = (N*(N-1))/2;
			int edgeCtr = 0;
			ArrayList<Integer> constKeeper = new ArrayList<Integer>();
			ArrayList<String> concnKeeper = new ArrayList<String>();
			int totalCost = 0;
			for(int i = 0 ; i < N ; i++){
				String temp = bufferRead.readLine();
				String[] costLine = temp.split(" ");
				int j = 0;
				for(String str:costLine){
					COST[i][j] = Integer.parseInt(str);
					j++;
				}
			}
			for(int i = 0 ; i < N ; i++){
				String temp = bufferRead.readLine();
				String[] mangLine = temp.split(" ");
				int j = 0;
				for(String str:mangLine){
					MANG[i][j] = Integer.parseInt(str);
					j++;
				}
			}
			for(int i = 0 ; i < N ; i++){
				for(int j = 0 ; j < N ; j++){
					if(i==j){
						COST[i][j] =1001;
					}
				}
			}
			while(edgeCtr < expectedEdges){
				int storeI=0,storeJ=1;
				 int low = COST[storeI][storeJ];
				for(int i = 0 ; i < N ; i++){
					for(int j = 0 ; j < N ; j++){
						if(COST[i][j] <= low){
							low = COST[i][j];
							storeI = i;
							storeJ = j;
						}
					}
				}
				if(COST[storeI][storeJ] < COST[storeJ][storeI]){
						totalCost += COST[storeI][storeJ];
						COST[storeI][storeJ] = 1001;
						constKeeper.add(storeI);
				}
				else{
						totalCost += COST[storeJ][storeI];
						COST[storeJ][storeI] = 1001;
						constKeeper.add(storeJ);
				}
				
				edgeCtr++;
			}
			
			
			Collections.sort(constKeeper);
			for(int x = 0 ; x < constKeeper.size() ; x++){
				int i = constKeeper.get(x);
				int low = MANG[i][0];
				for(int j = 0 ; j < N ; j++){
					if(MANG[i][j] <= low){
						low = MANG[i][j];
					}
				}
				totalCost += low;
			}//
			System.out.println(totalCost);
		}
		catch(IOException Ex){
			Ex.printStackTrace();
		}
	}

}
