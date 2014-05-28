package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.math.BigDecimal;
public class SpclMultiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader bufferedRdr = new BufferedReader(new InputStreamReader(System.in));
			int testCases = Integer.parseInt(bufferedRdr.readLine());
			while(testCases != 0){
				String tmp = bufferedRdr.readLine().trim();
				int len = tmp.length();
				int N = Integer.parseInt(tmp);
				BigDecimal bdN = BigDecimal.valueOf(N);
				boolean found = false;
				while(!found){
					BigDecimal x = findcombo09(len,bdN);
					if(x.compareTo(BigDecimal.ZERO)  != 0){
						System.out.println(x);
						found = true;
					}else{
						len++;
					}
				}
				
				testCases--;
			}
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		//findcombo09(6);
	}
	public static BigDecimal findcombo09(int n,BigDecimal nmbr){
		//int[] arr = new int[(int)(Math.pow(2, n)-1)];
		long tmpnum = 9*(long)Math.pow(10, n-1);
		BigDecimal num = BigDecimal.valueOf(tmpnum);
		BigDecimal tmp = num;
		if(num.remainder(nmbr) == BigDecimal.valueOf(0)){
			return num;
		}
		else{
			//System.out.println(tmp);
			for(int i = n-1 ; i >= 0 ; i--){
				for(int j = 0 ; j < i ; j++){
					//System.out.println(tmp);
					BigDecimal intmp = BigDecimal.valueOf(9*(long)Math.pow(10, j));
					tmp = num.add(intmp) ;
					if(tmp.remainder(nmbr) == BigDecimal.valueOf(0)){
						return tmp;
					}
					//System.out.println(tmp);
				}
				num = num.add(BigDecimal.valueOf(9*(long)Math.pow(10, i-1)));
			}
		}
		return BigDecimal.ZERO;
	}
}
