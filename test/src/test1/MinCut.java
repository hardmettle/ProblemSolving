package test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MinCut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] NodeArr = new int[200];
		int counter = 0;
		ArrayList<String> EdgeArr = new ArrayList<String>();
		try{
			File file = new File("C:/Users/Harsh/Downloads/kargerMinCut.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			String[] temp ;
			while((line = bufferedReader.readLine()) != null){
				counter++;
				temp = line.split("\t");
				for(int i = 1; i < temp.length ; i++){
					String elt = counter+"-"+temp[i];
					String eltrev = temp[i]+"-"+counter;
					if(!(EdgeArr.contains(elt)) && !(EdgeArr.contains(eltrev))){
						EdgeArr.add(elt);
					}
					
				}
				NodeArr[counter-1] = counter;
			}
			bufferedReader.close();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		

	}

}
