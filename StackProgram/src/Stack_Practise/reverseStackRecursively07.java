package Stack_Practise;

import java.util.Stack;

public class reverseStackRecursively07 {
	public static void displayReverse(Stack<Integer> st) {
		if(st.isEmpty()) return;
		int top = st.pop();
		System.out.println(top); // if u print same no. then isko line no 9 mein likho displayReverse(st), aur print ko iske niche
		displayReverse(st);
		st.push(top);
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		displayReverse(st);
	}
}
