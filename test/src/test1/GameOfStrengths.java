package test1;

/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class GameOfStrengths {
    public static void main(String args[] ) throws Exception {
        
         //* Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
        	int pow = 0;
        	int N = Integer.parseInt(br.readLine());
        	String[] A = br.readLine().split(" ");
        	int[] results = new int[N];
        	for (int j = 0; j < N; j++) {
        	    try {
        	        results[j] = Integer.parseInt(A[j]);
        	    } catch (NumberFormatException nfe) {};
        	}
        	Arrays.sort(results);
        	//2k - n + 1)ak
        	for(int k = 0 ; k < N ; k++){
        		pow += ((2*k)-N+1)*results[k];
        	}
        	pow *= results[N-1]; 
        	 System.out.println(pow);
        }
    }
}
