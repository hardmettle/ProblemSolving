package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Taut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader bufferedRdr = new BufferedReader(new InputStreamReader(System.in));
			int testCases = Integer.parseInt(bufferedRdr.readLine());
			while(testCases != 0){
				String expr = bufferedRdr.readLine();
				System.out.println(evalExpr(expr));
				testCases--;
			}
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	}
	public static String evalExpr(String e){
		boolean[] exprStack = new boolean[e.length()];
		int top = e.length()-1;
		int opCount = getOperandCount(e);
		if(opCount == 2){
			boolean[] cases = new boolean[1];
			int caseCtr = 0;
			for(int tc = 1;tc <= 4 ; tc ++){
				if(tc == 1){
					boolean[]  tmp = {true , true};
					cases = tmp;
				}
				if(tc == 2){
					boolean[]  tmp = {true , false};
					cases = tmp;
				}
				if(tc == 3){
					boolean[]  tmp = {false , true};
					cases = tmp;
				}
				if(tc == 4){
					boolean[]  tmp = {false , false};
					cases = tmp;
				}
				int ctr = 0;
				while(ctr != e.length()	){
					if(isOperand(e.charAt(ctr))){
						exprStack[top] = cases[caseCtr];
						top--;
						caseCtr++;
					}
					if(isOperator(e.charAt(ctr))){
						if(e.charAt(ctr) == 'N'){
							exprStack[top] = !exprStack[top];
						}
						else{
							boolean op1 = exprStack[top];
							boolean op2 = exprStack[top+1];
							boolean res = evaluate(op1,op2,e.charAt(ctr));
							exprStack[top+1] = res;
							top --;
						}
					}
					ctr++;
				}
			}
			if(exprStack[top] == true){
				return "YES";
			}else{
				return "NO";
			}
		}
		if(opCount == 3){
			boolean[] cases = new boolean[2];
			int caseCtr = 0;
			for(int tc = 1;tc <= 8 ; tc ++){
				if(tc == 1){
					boolean[]  tmp = {true , true ,true};
					cases = tmp;
				}
				if(tc == 2){
					boolean[]  tmp = {true , true ,false};
					cases = tmp;
				}
				if(tc == 3){
					boolean[]  tmp = {true , false , true};
					cases = tmp;
				}
				if(tc == 4){
					boolean[]  tmp = {false , true , true};
					cases = tmp;
				}
				if(tc == 5){
					boolean[]  tmp = {true , false , false};
					cases = tmp;
				}
				if(tc == 6){
					boolean[]  tmp = {false , false , true};
					cases = tmp;
				}
				if(tc == 7){
					boolean[]  tmp = {false , true , true};
					cases = tmp;
				}
				if(tc == 8){
					boolean[]  tmp = {false , true , true};
					cases = tmp;
				}
				int ctr = 0;
				while(ctr != e.length()	){
					if(isOperand(e.charAt(ctr))){
						exprStack[top] = cases[caseCtr];
						top--;
						caseCtr++;
					}
					if(isOperator(e.charAt(ctr))){
						if(e.charAt(ctr) == 'N'){
							exprStack[top] = !exprStack[top];
						}
						else{
							boolean op1 = exprStack[top];
							boolean op2 = exprStack[top+1];
							boolean res = evaluate(op1,op2,e.charAt(ctr));
							exprStack[top+1] = res;
							top --;
						}
					}
					ctr++;
				}
			}
			if(exprStack[top] == true){
				return "YES";
			}else{
				return "NO";
			}
		}
		
	}
	public static boolean evaluate(boolean o1,boolean o2, char optr) {
		switch (optr){
			case 'C' : return (o1 && o2);
			case 'D' : return (o1 || o2);
			case 'I' : return (!o1 || o2);
			case 'E' : if(o1 == o2) return true; else return false;
			default  : return false ;
		}
	}
	public static int getOperandCount(String s){
		int c = 0;
		for(int i = 0 ; i < s.length() ; i++){
			if(Character.isLowerCase(s.charAt(i))){
				c++;
			}
		}
		return c;
	}
	public static boolean isOperand(char o){
		if(Character.isLowerCase(o)){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isOperator(char o){
		if(Character.isUpperCase(o)){
			return true;
		}else{
			return false;
		}
	}
}

