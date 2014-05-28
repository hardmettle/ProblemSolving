package test1;

//import java.util.HashMap;
//import java.util.Map;

public class FBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] N = new int[]{1,2,5,7};
		int K = 2;
		int grpCtr = 0;
		int minMov = 0;
		int minMovCtr = 0;
		int gI = 0;
		int gJ = 0;
		boolean hasStarted = false;
		int[][] DisMat = new int[][]{
			{0, 1, 4, 6},
			{1, 0, 3, 5},
			{4, 3, 0, 2},
			{6, 5, 2, 0}
		};
		while(grpCtr < K){
			for(int i = 0 ; i < DisMat.length ; i++ ){
				if(hasStarted && (i == gI || i ==gI+1)){
					continue;
				}
				for(int j = 0 ; j < DisMat[i].length ; j++){
					if((DisMat[i][j] == 1 && minMov !=1) || (DisMat[i][j] < minMov && DisMat[i][j] != 0) ){
						minMov = DisMat[i][j];
						gI = i;
						gJ = j;
					}
				}
			}
			int t;
			for(t = 0 ; t < DisMat[gI].length ; t++){
				if(DisMat[gI][t] == 0){
					break;
				}
			}
			int temp = DisMat[gI][gJ];
			DisMat[gI][gJ] = 0;
			DisMat[gI][t]  = temp;
			grpCtr++;
			minMovCtr+=minMov;
			hasStarted = true;
			minMov = 0;
		}
		System.out.print("Presenting ::: "+minMovCtr);
	}	
}	
//		for(int i = 0 ; i < N.length ; i++ ){
//			
//		 }
		

	


