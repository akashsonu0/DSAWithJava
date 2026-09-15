package Stack_Practise;

import java.util.Stack;

public class pushElementAtButtom05 {
	public static void main(String[] args) {
		// insert at buttom
		Stack<Integer> st_original = new Stack<>();
		st_original.push(10);
		st_original.push(20);
		st_original.push(30);
		st_original.push(40);
		System.out.println(st_original);
		
		int new_element = 50;
		Stack<Integer> st_temporary = new Stack<>();
		//while(st_original.size() > 0 ) bhi likh skta hai
		while(!st_original.isEmpty()) {
			st_temporary.push(st_original.pop());
			
		}
		//System.out.println(st_temporary);
		st_original.push(new_element);
		while(!st_temporary.isEmpty()) {
			st_original.push(st_temporary.pop());	
		}
		System.out.println(st_original);
		
		
		
		
	}

}
