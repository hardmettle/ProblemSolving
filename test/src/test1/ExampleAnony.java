package test1;

public class ExampleAnony {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		String ex = "((2*5)+(20/2)-((20-10)*2))+1";
		int N = ex.length();
		char[] A = new char[N-1];
		int ptr = N-1;
		for(int i=0 ; i < N ; i++){
			char c = ex.charAt(i);
			switch(c){
			case '(' : A[i] = c;break;
			case ')' : for(int j = N-1; j <= ptr ; j--){
							if(A[j]=='('){
								A[j] = A[ptr];
								ptr = j;
								break;
							}
						}
						break;
			case '+' :  int tmp = A[ptr] + ex.charAt(i);
						
						break;
			case '-' :
			case '*' :
			case '/' :	
				
			}
			if(c == '('){
				A[i] = c;
			}
		}
	}
}

