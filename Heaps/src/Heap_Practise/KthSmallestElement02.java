package Heap_Practise;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement02 {
	public static void main(String[] args) {
		// Brute Force
//		int[] arr = {10,2,8,3,-6,-2,9,-12};
//		int k = 4;
//		// MinHeap
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		for(int ele : arr) {
//			pq.add(ele);
//		}
//		for(int i=1;i<=k-1;i++) {
//			pq.remove();
//		}
//		System.out.println(pq.peek());

		
		// Optimized
		int[] arr = {10,2,8,3,-6,-2,9,-12};
		int k = 4;
		// MinHeap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int ele : arr) {
			pq.add(ele);
			if(pq.size() > k) pq.remove();
		}
		System.out.println(pq.peek());
	}

}
