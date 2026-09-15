package Stack_Practise;

import java.util.Stack;

public class copyStackIntoAnotherStack03 {
	public static void main(String[] args) {
		Stack<Integer> st_original = new Stack<>();
		st_original.push(10);
		st_original.push(20);
		st_original.push(30);
		st_original.push(40);
		System.out.println(st_original);
		
		Stack<Integer> st_temporary = new Stack<>();
		while(!st_original.isEmpty()) {
			st_temporary.push(st_original.pop());
			
		}
		System.out.println(st_temporary);
		
		Stack<Integer> st_final = new Stack<>();
		while(!st_temporary.isEmpty()) {
			st_final.push(st_temporary.pop());
			
		}
		System.out.println(st_final);
	}

}
