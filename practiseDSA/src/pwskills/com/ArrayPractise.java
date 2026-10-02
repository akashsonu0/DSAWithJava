package pwskills.com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArrayPractise {	
	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		que.add(60);
		que.add(70);
		
		Queue<Integer> newQue = new LinkedList<>();
		 while(!que.isEmpty()) {
			 que.remove();
			 if(!que.isEmpty()) {
				 newQue.add(que.remove());
			 }
		 }
		que = newQue;
		System.out.println(newQue);
	}
}
