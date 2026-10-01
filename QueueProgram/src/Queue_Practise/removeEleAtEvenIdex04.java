package Queue_Practise;

import java.util.LinkedList;
import java.util.Queue;

/*
 Remove elements at even index in a queue
 (use 0 based idexing)
 */

public class removeEleAtEvenIdex04 {
	static Queue<Integer> que;
	static Queue<Integer> newQue;
	
	static void removeEven() {
		newQue = new LinkedList<Integer>();
		while(!que.isEmpty()) {
			que.remove();
			if(!que.isEmpty()) {
				newQue.add(que.remove());
			}	
		}	
		que = newQue;
	}
	
	static void print() {
		System.out.println(que);
	}

	public static void main(String[] args) {
		que = new LinkedList<Integer>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		System.out.println(que);
		removeEven();
		print();
	}

}
