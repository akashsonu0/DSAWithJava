package pwskills.com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
	int val;
	Node left;
	Node right;
	Node(int val){
		this.val = val;
	}
}
public class BTPractise {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node a = new Node(1);
		Node b = new Node(7);
		Node c = new Node(9);
		Node d = new Node(2);
		Node e = new Node(6);
		Node f = new Node(9);
		Node g = new Node(5);
		Node h = new Node(11);
		Node i = new Node(5);
		
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
	    c.right = f;
	    e.left = g; e.right = h;
	    f.left =i;
		
		System.out.print("Enter n : ");
		n = sc.nextInt();
		LTR(a,0);
		
		for(int x=0;x<=4;x++) {
			n = x;
			LTR(a,0);
			System.out.println();
		}
	}
	public static void LTR(Node root , int level) {
		if(root == null) return;
		if(level == n) System.out.print(root.val+" ");
		LTR(root.left, level+1);
		LTR(root.right, level+1);
		
		
	}
}
