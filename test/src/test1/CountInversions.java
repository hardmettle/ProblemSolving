package test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class CountInversions {

	/**
	 * @param args
	 */
	static long countOfInversion = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] initialArray = new int[100000];
		int[] initialArray2 = new int[]  { 9, 12, 3, 1, 6, 8, 2, 5, 14, 13, 11, 7, 10, 4, 0 };	
		int counter = 0;
		try{
			File file = new File("C:/Users/Harsh/Downloads/IntegerArray.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			while((line = bufferedReader.readLine()) != null){
				initialArray[counter] = Integer.parseInt(line);
				counter++;
			}
			bufferedReader.close();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		System.out.println(sortAndCount(initialArray));
		System.out.println(countOfInversion);
	}
	public static int[] sortAndCount(int[] A){
		int[] B = new int[A.length/2];
		int[] C = new int[A.length - A.length/2];

		if(A.length <= 1){
			return A;
		}
		else{
			B = Arrays.copyOfRange(A, 0, A.length/2);
			C = Arrays.copyOfRange(A, A.length/2, A.length);
			
			B = sortAndCount(B);
			C = sortAndCount(C);
			
			
			return  countSplitInv(B,C);
		}
	}
	public static int[] countSplitInv(int[] first,int[] second){
		int origarrlen = first.length+second.length;
		int[] tempArr =  new int[origarrlen];
		
		//int tempCount=0;
		int j=0,k=0;
		for(int i=0;i<origarrlen;i++){
			if(j>first.length-1){
				for(int t=k;t<second.length;t++){
					tempArr[i]=second[t];
					i++;
				}
				return tempArr;
			}
			if(k > second.length-1){
				for(int t=j;t<first.length;t++){
					tempArr[i]=first[t];
					i++;
				}
				
				return tempArr;
			}
			if(first[j]<second[k]){
				tempArr[i]=first[j];
				j++;
			}
			else{
				if(first[j]>second[k]){
					countOfInversion+=first.length-j;
					tempArr[i]=second[k];
					k++;
				}
			}
		}
		return tempArr;
	}
}
