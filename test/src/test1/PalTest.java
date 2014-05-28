package test1;

public class PalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "aaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		int count = 0;
		if(S.equals(new StringBuffer().append(S).reverse().toString())){
			System.out.print(count);
		}
		int i = 0;
		int j = (S.length()-1);
		//String R = S.substring(0, j);
		//String T = S.substring(j+1, S.length());
		StringBuffer T = new StringBuffer();
		while(j > i){
			if(S.charAt(i) != S.charAt(j)){
				T = new StringBuffer(S);
				T.insert(j+1, S.charAt(i));
				S= T.toString();
				System.out.println(S);
				i = 0;
				j = (S.length()-1);
				count++;
				
			}
			else{
				i++;
				j--;
			}
			if(S.equals(new StringBuffer().append(S).reverse().toString()))
			{
				break;
			}
			System.out.println(S.charAt(j)+" "+T);
		}
		System.out.println(S+count);
		

	}
}
