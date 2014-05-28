package test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sherlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    //System.out.println("Enter the sentece :::: ");
		    int testCases = Integer.parseInt(bufferRead.readLine());
		    int[] inputArray = new int[testCases]; 
		    //String[] ouptutArray = new String[testCases]; 
		    int x = 0;
		    while(testCases > 0){
		    	int N = Integer.parseInt(bufferRead.readLine());
		    	inputArray[x] = N;
		    	x++;
		    	testCases--;
		    }
		    for(int i = 0 ; i < inputArray.length ; i++){
		    	int N = inputArray[i];
		    	String snum = "";
		    	if(N < 3)
		    	{
		    		snum = "-1";
		    		//ouptutArray[i] = "-1";
		    		//continue;
		    	}
		    	else{
		    		
		    		if(N % 3 == 0){
		    			snum = "5";
			    		while(snum.length() < N){
			    			snum = snum+snum;
			    		}
			    		if(snum.length()-N > 0){
		    				int extra = snum.length()-N;
		    				snum = snum.substring(extra, snum.length());
		    			}
			    	}
			    	else{
			    		int threeCount = 0;
			    		int fiveCount = 0;
			    		if(N % 3 == 2){
			    			threeCount = N - 5;
			    			fiveCount = 5;
			    		}
			    		else{
			    			if(N % 3 == 1 && N - 10 >= 0 ){
			    				threeCount = N - 10;
			    				fiveCount = 10;
			    			}
			    		}
			    		if(threeCount == 0 && fiveCount == 0){	
			    			snum = "-1";
			    		}
			    		else{
			    			//String tempStr = "";
			    			snum = "5";
			    			while(snum.length() < threeCount){
				    			//snum +="5";
				    			snum = snum+snum;
				    			//tempStr = snum;
				    			//threeCount--;
				    		}
			    			if(snum.length()-threeCount > 0){
			    				int extra = snum.length()-threeCount;
			    				snum = snum.substring(extra, snum.length());
			    			}
				    		while(fiveCount > 0){
				    			snum += "3";
				    			fiveCount--;
				    		}
				    		//snum = snum.trim();
				    		//ouptutArray[i] = snum;
			    		}
			    	}
		    	}
		    	
		    	System.out.println(snum);
		    }

		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
