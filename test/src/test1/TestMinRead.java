package test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestMinRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File file = new File("C:/Users/Harsh/Downloads/kargerMinCut.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			String line2;
			line = bufferedReader.readLine();
			line2 = bufferedReader.readLine();
			System.out.println(line);
			System.out.println(line2);
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
