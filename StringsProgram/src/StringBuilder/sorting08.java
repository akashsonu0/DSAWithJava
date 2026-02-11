package StringBuilder;

import java.util.Arrays;

public class sorting08 {
	public static void main(String[] args) {
		String s = "Akash";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		for(char ele : ch) {
			System.out.print(ele);
		}
		System.out.println();
		StringBuilder sb = new StringBuilder("Akash");
		char[] arr = sb.toString().toCharArray();
		Arrays.sort(arr);
		for(char ele : arr) {
			System.out.print(ele);
		}
	}

}
