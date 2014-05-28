package test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FileInputStream fis = null;
	      InputStreamReader isr =null;
	      char[] cbuf = new char[11];
	      int i;
	      
	      try {
	         // new input stream reader is created 
	         fis = new FileInputStream("C:/Users/Harsh/Downloads/test.txt");
	         isr = new InputStreamReader(fis);
	         isr.skip(14);
	         i = isr.read(cbuf, 0,4);
	         System.out.println("Number of characters read: "+i);
	         String data = new String(cbuf);
	         System.out.println("Characters read:"+data);
	      }
	      catch(IOException ex)
	      {
	    	  ex.printStackTrace();
	      }

	}

}
