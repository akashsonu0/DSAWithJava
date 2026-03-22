package StringBuilder;

import java.util.Scanner;

public class frequencyArray09 {

	public static void main(String[] args) {
		String s = "abaaacrmnrrrrrra";
		int n = s.length();
		int[] freq = new int[26];
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i);
			int idx = (int)ch-97;
			freq[idx]++;
		}
		int maxFreq = -1;
		for(int i=0;i<n;i++) {
			maxFreq = Math.max(maxFreq, freq[i]);
		}
		for(int i=0;i<n;i++) {
			if(freq[i]==maxFreq) {
				char ch = (char) (i+97);
				System.out.println(ch);
			}
		}
		
	}

}
