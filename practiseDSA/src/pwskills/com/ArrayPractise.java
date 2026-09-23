package pwskills.com;

import java.util.Stack;

public class ArrayPractise {
	public static void nextGreater(int[] arr , int n) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[n];
		st.push(arr[n-1]);
		ans[n-1] = -1;
		for(int i=n-2;i>=0;i--) {
			while(!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i] = -1;
			}else {
				ans[i] = st.peek();
			}
			st.push(arr[i]);
		}
		for(int i=0;i<n;i++) {
			System.out.print(ans[i] + " ");
		}
	}
	public static void main(String[] args) {
		 int[] arr = {10, 4, 5, 20, 40, 12, 30};
	        int n = arr.length;
	        nextGreater(arr, n);
		
	}
}
