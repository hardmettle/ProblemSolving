package test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Goldbach  {

	public static void main(String[] args) throws Exception{ 
	      //int N = Integer.parseInt(args[0]);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int tc = Integer.parseInt(line);
		for (int a = 0; a < tc; a++) {
	        int N = Integer.parseInt( br.readLine());
	        boolean[] isprime = new boolean[N];

		      for (int i = 2; i < N; i++)
		         isprime[i] = true;

		      for (int i = 2; i * i < N; i++) {
		         if (isprime[i]) {
		            for (int j = i; i * j < N; j++)
		               isprime[i*j] = false;
		         }
		      }

		      int primes = 0;
		      for (int i = 2; i < N; i++)
		         if (isprime[i]) primes++;


		      int[] list = new int[primes];
		      int n = 0;
		      for (int i = 0; i < N; i++)
		         if (isprime[i]) list[n++] = i;
		      
		      int left = 0, right = primes-1;
		      while (left <= right) {
		         if      (list[left] + list[right] == N) break;
		         else if (list[left] + list[right]  < N) left++;
		         else right--;
		      }
		      if (list[left] + list[right] == N)
		         System.out.println("Deepa");
		      else
		         System.out.println("Arijit");
		   }
		}
	      
	}