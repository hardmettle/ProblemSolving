package test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] initialArray = new int[10000];
		int counter = 0 ;
		try{
			File file = new File("C:/Users/Harsh/Downloads/QuickSort.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			if(bufferedReader.ready()){
				System.out.print(bufferedReader.readLine());
			}else{
				bufferedReader = new BufferedReader(new FileReader(file));
			}
			/*while((line = bufferedReader.readLine()) != null){
				initialArray[counter] = Integer.parseInt(line);
				counter++;
			}*/
			bufferedReader.close();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
