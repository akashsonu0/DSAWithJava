package Stack_Practise;

import java.util.Stack;

public class pushElementAtAnyIndex06 {
	public static void main(String[] args) {
		Stack<Integer> st_original = new Stack<>();
		st_original.push(10);
		st_original.push(20);
		st_original.push(30);
		st_original.push(40);
		System.out.println(st_original);
		
		int new_element = 50;
		int pos = 2;
		Stack<Integer> st_temporary = new Stack<>();
		
		while(st_original.size() >= pos) {
			st_temporary.push(st_original.pop());
			
		}
		//System.out.println(st_temporary);
		// our position in original stack is empty , so we push new element at that position
		st_original.push(new_element);
		
		while(!st_temporary.isEmpty()) {
			st_original.push(st_temporary.pop());	
		}
		
		System.out.println(st_original);
		
		
		
		
	}

}
