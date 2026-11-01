package Heap_Practise;

import java.util.Collections;
import java.util.PriorityQueue;

public class BasicHeapCF01 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(2);
		System.out.println(pq+" "+pq.peek());
		pq.add(10);
		System.out.println(pq+" "+pq.peek());
		pq.add(1);
		System.out.println(pq+" "+pq.peek());
		pq.remove();
		System.out.println(pq+" "+pq.peek());
		pq.add(0);
		System.out.println(pq+" "+pq.peek());
		pq.add(-34);
		System.out.println(pq+" "+pq.peek());
		
		System.out.println("_____________________________");
		System.out.println();
		
		// Max Heap
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
		pq1.add(2);
		System.out.println(pq1+" "+pq1.peek());
		pq1.add(10);
		System.out.println(pq1+" "+pq1.peek());
		pq1.add(1);
		System.out.println(pq1+" "+pq1.peek());
		pq1.remove();
		System.out.println(pq1+" "+pq1.peek());
		pq1.add(0);
		System.out.println(pq1+" "+pq1.peek());
		pq1.add(-34);
		System.out.println(pq1+" "+pq1.peek());
	}

}
