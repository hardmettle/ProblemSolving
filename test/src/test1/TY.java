package test1;

public class TY {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findcombo09(3);
	}
	public static void findcombo09(int n){
		//int[] arr = new int[(int)(Math.pow(2, n)-1)];
		long num = 9*(long)Math.pow(10, n-1);
		long tmp = num;
		System.out.println(tmp);
		for(int i = n-1 ; i >= 0 ; i--){
			for(int j = 0 ; j < i ; j++){
				//System.out.println(tmp);
				tmp = num + 9*(long)Math.pow(10, j);
				System.out.println(tmp);
			}
			num += 9*(long)Math.pow(10, i-1);
		}
	}

}
