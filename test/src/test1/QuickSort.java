package test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class QuickSort {

	/**
	 * @param args
	 */
	static int countOfComparisons=0;
	static int pivotChoice=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] initialArray = new int[10000];
		int[] initialArray2 = new int[]  { 9, 12, 3, 1, 6, 8, 2, 5, 14, 13, 11, 7, 10, 4, 0 };
		//int[] initialArray2 = new int[]  { 3,8,2,5,1,4,7,6 };
		int counter = 0;
		try{
			File file = new File("C:/Users/Harsh/Downloads/QuickSort.txt");
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
		System.out.println("Before quicksort comparison count is :: "+countOfComparisons+" and now printing initial array :: ");
		for (int elt : initialArray){
			System.out.print(elt+" ");
		}
		 quickSort(initialArray,0,initialArray.length-1);
		System.out.println();
		System.out.println("After quicksort comparison count is :: "+countOfComparisons+" and now printing sorted array ::");
		for (int elt2 : initialArray){
			System.out.print(elt2+" ");
		}

	}
	public static void quickSort(int[] A,int left,int right){
		
		if(left == right+1){
			return ;
		}
		int p ;
		if((right-left) % 2 == 0){
				p = (right-left)/2;
			}
			else{
				p = ((right-left+1)/2)+1;
			}
		int s = 0 ;// = A[left] > A[p] ? (A[left] > A[right] ? A[left] : A[right]) : (A[p] > A[right] ? A[p] : A[right]) ;
		s = right;
		if(A[left] > A[p]){
			 	if(A[p] > A[right]){
			 		s = p;
			 	}
			 	if(A[right] > A[left]){
			 		s = left;
			 	}
		}
		else{
			if(A[left] > A[right]){
				s = left;
			}
			if(A[right] > A[p]) {
				s = p;
			}
		}
		
		
		
		int t = A[s];
		A[s] = A[left];
		A[left] = t;
		int partPoint = partition(A, left, right);
		quickSort(A,left,partPoint-1);
		quickSort(A,partPoint+1,right);
		
	}
	public static int partition(int[] A,int left,int right){
		
	
		int pivot = A[left];
		 
		int i = left+1;
		for(int j = left+1; j <= right; j++){
			if(A[j] < pivot){
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
			}
		}
		int temp2 = A[left];
		A[left] = A[i-1];
		A[i-1] = temp2;
		countOfComparisons += right-left;
		return i-1;
	}

}
