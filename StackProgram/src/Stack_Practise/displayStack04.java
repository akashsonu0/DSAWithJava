package Stack_Practise;

import java.util.Stack;

public class displayStack04 {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(5);
		st.push(10);
		st.push(20);
		System.out.println(st);
		System.out.println();
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

}
