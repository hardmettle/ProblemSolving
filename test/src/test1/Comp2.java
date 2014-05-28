package test1;

import java.util.Arrays;

public class Comp2 {
	
	public static void main(String[] args){
		String[] input1={"a#x","c#a","y#c","f#e","g#k","r#f","a#r","a#c","e#a"}; 
		Arrays.sort(input1);
		for(String s : input1){
			System.out.println("sorted  "+s);
		}
		construction(input1);
	}
	public static void createTail(String incomingstr){
		
	}
	public static void construction(String[] input1)
    {
        //Write code here
		for(int i = 0 ; i < input1.length ; i++)
		{
			String joinedstr = new String();
			String dependents = new String();
			
			joinedstr += input1[i].replace("#", "");
			for(int j=0 ; j< input1.length ; j++)
			{
				if(j != i)
				{
					if(input1[j].charAt(0) == joinedstr.charAt(joinedstr.length()-1))
					{
						String temp= input1[j].replace("#", "");
						dependents += temp.charAt(1);
						
					}
				}
			}
			joinedstr += dependents;
			System.out.println(joinedstr);
		}
    }

}
