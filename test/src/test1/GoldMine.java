package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldMine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] tmparr = br.readLine().split(" ");
			
			int R = Integer.parseInt(tmparr[0]);
			int C = Integer.parseInt(tmparr[1]);
			String[][] GMatrix = new String[R-1][C-1];
			int i = 0; 
			while(i != R){
				String[] tmparr2 = br.readLine().split(" ");
				GMatrix[i] = tmparr2;
				i++;
			}
			i = 0;
			int Q = Integer.parseInt(br.readLine());
			while(i != Q){
				String[] tmparr2 = br.readLine().split(" ");
				int x1 = Integer.parseInt(tmparr2[0]) - 1;
				int y1 = Integer.parseInt(tmparr2[1]) - 1;
				int x2 = Integer.parseInt(tmparr2[2]) - 1;
				int y2 = Integer.parseInt(tmparr2[3]) - 1;
				if(x1 != x2 && y1 != y2){
					int diffX = x2-x1;
					int diffY = y2-y1;
					if(diffX > diffY){
						for(int j = y1; j <= y2 ; j++){
							
						}
					}
				}
				i++;
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		

	}

}
