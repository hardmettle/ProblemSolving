package test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MindPalace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        String[] NM = br.readLine().split(" ");
	        int N = Integer.parseInt(NM[0]);
	        	
	        String[] arr = new String[N];
	        for (int i = 0; i < N; i++) {
	            arr [i] = br.readLine();
	        }
	        int Q = Integer.parseInt(br.readLine());
	        while(Q > 0){
	        	String X = br.readLine();
	        	boolean isprinted = false;
	        	for(int j = 0 ; j < N ; j++){
	        		if(arr[j].split(" "+X+" ").length > 1 || arr[j].split("^"+X+" ").length > 1){
	        			String[] tarr = arr[j].split(" ");
	        			System.out.println(j+" "+binarySearch(X , tarr));
	        			isprinted = true;
	        		}
	        	}
	        	if(!isprinted){
	        		System.out.println(-1+" "+-1);
	        	}
	        	Q--;
	        }
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}
	public static int binarySearch(String key,String[] data) 
    {
         int low = 0;
         int high = data.length - 1;
          
         while(high >= low) {
             int middle = (low + high) / 2;
             if(data[middle].equals(key)) {
                 return middle;
             }
             if(Integer.parseInt(data[middle]) < Integer.parseInt(key)) {
                 low = middle + 1;
             }
             if(Integer.parseInt(data[middle]) > Integer.parseInt(key)) {
                 high = middle - 1;
             }
        }
         return -1;
    }

}
