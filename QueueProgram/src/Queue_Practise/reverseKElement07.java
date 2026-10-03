package Queue_Practise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseKElement07 {
	public Queue<Integer> modifyQueue(Queue<Integer> q, int k){
		// use an auxillary stack
		Stack<Integer> st = new Stack<>();
		int n = q.size()-k;
		
		// we pop first k ele from queue and push in stack
		while(k-- > 0) {
			int a = q.peek();
			q.poll();
			st.push(a);
		}
		
		// while stack is not empty, we push the elements back into the queue
		while(!st.isEmpty()) {
			int a = st.peek();
			st.pop();
			q.add(a);
		}
		
		for(int i=0;i<n;i++) {
			int a = q.peek();
			q.poll();
			q.add(a);
		}
		return q;
	
	}
	public static void main(String[] args) {
		reverseKElement07 rev = new reverseKElement07();
		Queue<Integer> que = new LinkedList<>();
		// 10 20 30 40 50  , k = 3
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		Queue<Integer> newq = rev.modifyQueue(que , 3);
		System.out.println(newq);
	}

}
