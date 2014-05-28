package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.TreeMap;

public class HackerX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader bufferedRdr = new BufferedReader(new InputStreamReader(System.in));
			//HashMap<Integer, Integer> tfMap = new HashMap<Integer,Integer>();
			int N = Integer.parseInt(bufferedRdr.readLine());
			ArrayList<Integer>  timeKeeper = new ArrayList<Integer>();
			ArrayList<Integer>  freqKeeper = new ArrayList<Integer>();
			int ctr = 1;
			//int numOfMiss = 1;
			ArrayList<Integer> missileFreqList = new ArrayList<Integer>();
			while(ctr <= N){
				String[] tmp = bufferedRdr.readLine().split(" ");
				//tfMap.put(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]));
				timeKeeper.add(Integer.parseInt(tmp[0]));
				freqKeeper.add(Integer.parseInt(tmp[1]));
				ctr++;
			}
			//Map<Integer, Integer> treetfMap = new TreeMap<Integer, Integer>(tfMap);
			//Iterator<Map.Entry<Integer, Integer>> it = treetfMap.entrySet().iterator();
			int timeWindow = 0 ;
			int i = 0;
			while(i != timeKeeper.size()){
			
				if(missileFreqList.size() == 0){
					missileFreqList.add(freqKeeper.get(i));
				}else{
					int currFreqVal = freqKeeper.get(i);
					if(!(timeWindow == 0 && currFreqVal == freqKeeper.get(i-1))){
						int time = timeWindow;
						while(time >= -timeWindow){
							if(missileFreqList.contains(currFreqVal+time)){
								missileFreqList.set(missileFreqList.indexOf(currFreqVal+time), currFreqVal);
								break;
							}else{
								time--;
							}
						}
						if(time < -timeWindow){
							missileFreqList.add(currFreqVal);
						}
					}
				}
				if(i+1 != timeKeeper.size()){
					timeWindow = timeKeeper.get(i+1) - timeKeeper.get(i);
				}
				i++;
			}
			System.out.println(missileFreqList.size());
		}catch(IOException ex){
			ex.printStackTrace();
		}

	}

}
