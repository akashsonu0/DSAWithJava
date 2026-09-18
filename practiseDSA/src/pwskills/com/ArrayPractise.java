package pwskills.com;

import java.util.Scanner;
import java.util.Stack;

public class ArrayPractise {
	public static void main(String[] args) {
		Stack<Integer> st_org = new Stack<>();
		st_org.push(10);
		st_org.push(20);
		st_org.push(30);
		st_org.push(40);
		st_org.push(50);
		System.out.println(st_org);
		
		int new_ele = 5;
		int pos = 2;
		Stack<Integer> st_temp = new Stack<>();
		while(st_org.size() >= pos) {
			st_temp.push(st_org.pop());
		}
		System.out.println(st_temp);
		
		st_org.push(new_ele);
		while(!st_temp.isEmpty()) {
			st_org.push(st_temp.pop());
		}
		System.out.println(st_org);
	}
}
