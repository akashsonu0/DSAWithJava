package pwskills.com;

import java.util.Arrays;
import java.util.Stack;

public class ArrayPractise {
	public static void main(String[] args) {
		 int price[] = {100, 80, 60, 70, 60, 75, 85};
	     int n = price.length;
	     int[] arr = new int[n];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		for(int i=1;i<n;i++) {
			while(!st.isEmpty() && price[i] >= price[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				arr[i] = i+1;
			}
			else {
				arr[i] = i - st.peek();
				st.push(i);
			}
		}
		arr[0] = 1;
		System.out.print(Arrays.toString(arr));
  }
}
