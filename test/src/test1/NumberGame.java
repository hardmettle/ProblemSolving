package test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NumberGame {

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
	        	int ctr = 0;
	            String[] XY = br.readLine().split(" ");
	            int X = Integer.parseInt(XY[0]);
	            int Y = Integer.parseInt(XY[1]);
	            if(X == 1){
	            	ctr++;
	            	X++;
	            }
	            for(int j = X ; j <= Y ; j++){
	            	if(isSpcl(j)){
	            		ctr++;
	            	}
	            }
	            System.out.println(ctr);
	        }
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}
	public static boolean isSpcl(int n){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		while (n%2 == 0)
	    {
	        if(map.get(2) != null){
	        		return false;
	        	//map.put(2,map.get(2)+1);
	        }
	        else{
	        	map.put(2,1);
	        }
	        n = n/2;
	    }
	 
	    for (int i = 3; i <= Math.sqrt(n); i = i+2)
	    {
	        while (n%i == 0)
	        {
	        	if(map.get(i) != null){
	        		return false;
		        	//map.put(i,map.get(i)+1);
		        }
	        	else{
		        	map.put(i,1);
		        }
	            n = n/i;
	        }
	    }
	    if (n > 2)
	     map.put(n,1);
	    return true;
	   
	}
}
