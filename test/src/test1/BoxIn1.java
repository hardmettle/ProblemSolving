package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoxIn1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader buffRdr = new BufferedReader(new InputStreamReader(System.in));
			HashMap<String, String> lruCache = new HashMap<String,String>();
			int N = Integer.parseInt(buffRdr.readLine());
			int ctr = 0;
			int upperBound = 0;
			ArrayList<String> outputList = new ArrayList<String>();
			while(N != ctr){
				String line = buffRdr.readLine();
				String[] lineArr = new String[3];
				if(!line.equals("DUMP")){
					lineArr = line.split(" ");
					switch (lineArr[0]){
						case "BOUND":	int newBound = Integer.parseInt(lineArr[1]);
											if(upperBound  > newBound && lruCache.size() > newBound){
												int extra = lruCache.size()	- newBound;
												Iterator<Map.Entry<String, String>> it = lruCache.entrySet().iterator();
												if(it.hasNext() && extra !=0){
													it.next();
													it.remove();
													extra--;
												}
											}
											else{
												upperBound = newBound;
											}
											break;
						case "SET": 	if(lruCache.size() < upperBound){
											lruCache.put(lineArr[1], lineArr[2]);
										}
										break;
						case "GET":		if(lruCache.get(lineArr[1]) != null){
											outputList.add(lruCache.get(lineArr[1]));
										}
										else{
											outputList.add("NULL");
										}
										break;
						case "PEEK":	outputList.add(lruCache.get(lineArr[1]));
										lruCache.remove(lineArr[1]);
										break;
					}
				}
				else{
					Set<String> keySet = lruCache.keySet();
					List<String> list = new ArrayList<String>(keySet);
					Collections.sort(list);
					for(String elt : list){
						outputList.add(elt+" "+lruCache.get(elt));
					}
				}
				ctr++;
			}
			for(String al : outputList){
				System.out.println(al);
			}
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
