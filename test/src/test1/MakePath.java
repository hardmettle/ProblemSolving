package test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakePath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        for (int i = 0; i < N; i++) {
	            System.out.println("hello world");
	        }
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
