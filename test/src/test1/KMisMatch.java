package test1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class KMisMatch {
	static int K;

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		try {
			ArrayList<String> strList = new ArrayList<String>();
			BufferedReader bufferRead = new BufferedReader(
					new InputStreamReader(System.in));
			int k = Integer.parseInt(bufferRead.readLine());
			K = k;
			String S = bufferRead.readLine();
			int count = 0;
			for (int i = 0; i < S.length(); i++) {
				strList = new ArrayList<String>();
				for (int j = 0; i + j <= S.length(); j++) {
					String sub = new String(S.substring(j, i + j));
					if ("".equals(sub))
						continue;

					strList.add(sub);
					//System.out.println(sub);

				}
				for (int x = 0; x < strList.size(); x++) {
					for (int y = x + 1; y < strList.size(); y++) {
						if (MisMatch(strList.get(x), strList.get(y))) {
							count++;
						}
					}
				}
			}

			System.out.println(count);
		} catch (IOException Ex) {
			Ex.printStackTrace();
		}
	}

	public static boolean MisMatch(String s, String t) {

		int len = s.length();
		boolean isKMM = true;
		int mismatch = 0;
		
		if(len < K){
			return isKMM;
		}
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				mismatch++;
				if (mismatch > K) {
					isKMM = false;
					break;
				}
			}

		}
		// mismatch += Math.abs(s.length()- t.length());
		return isKMM;
	}
}