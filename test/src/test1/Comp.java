package test1;

//import java.io.*;

public class Comp {
	
	public static void main(String[] args)
	{
		String[] input1={"A","B","C","D"};
		int[]   input2={0,0,0,2,2,0};
		int co=minimum_cost(input1, input2);
		System.out.println(co);
	}
	
	
	    public static int minimum_cost(String[] input1,int[] input2)
	    {
	        //Write code here
	        int num_of_cities = input1.length;
	        int cost_arr_len  = input2.length;
	        if(num_of_cities ==0  ||  cost_arr_len==0)
	        {
	        	return 0;
	        }
	        int p=1;
	        for(int k=1;k<=num_of_cities;k++)
	        {
	        	p=p*k;
	        }
	        if(cost_arr_len!=p/4)
        	{
        		return 0;
        	}
	        int n = 0 ;
	        int min_cost=0;
	        while(n != cost_arr_len-1)
	        {
	        	int ctr=n+1;
	        	int sum=0;
	        	
	        	while(ctr != cost_arr_len-1)
	        	{
	        		sum=input2[n];
	        		for(int i=ctr;i<ctr+num_of_cities-2;i++)
	        		{
	        			sum+=input2[i];
	        		}
	        		if(ctr-1==0)
		        	{
		        		min_cost=sum;
		        	}
		        	else if(sum<min_cost)
		        	{
		        		min_cost=sum;
		        	}
	        		ctr++;
	        	}
	        	
	        	n++;
	    	}
	    	return min_cost;
	    }

}
