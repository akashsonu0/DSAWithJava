package recursion;

import java.util.ArrayList;

public class Subsets17 {
	// global Variable(kisi bhi function mein use kar skte hai)
	static ArrayList<String> arr = new ArrayList<>(); 
	public static void  printSubsets(int i,String s,String ans) {
		if(i==s.length()) {
			arr.add(ans);
			return;
		}
		char ch = s.charAt(i);
		printSubsets(i+1,s,ans); // not take
		printSubsets(i+1,s,ans+ch); // take
	}

	public static void main(String[] args) {
		String s = "abcd";
		printSubsets(0,s,"");
		System.out.println(arr);
	}

}
