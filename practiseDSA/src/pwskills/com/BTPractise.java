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
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		Node h = new Node(8);
		Node i = new Node(9);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = f; c.right = g;
		e.left = h; f.right = i;
		
		System.out.print("Enter n : ");
		n = sc.nextInt();
		nThLevle(a,0);
		
		for(int x=0;x<=4;x++) {
			n=x;
			nThLevle(a,0);
			System.out.println();
		}
	}
	public static void nThLevle(Node root , int level) {
		if(root == null) return;
		if(level == n) System.out.print(root.val+" ");
		nThLevle(root.left,level+1);
		nThLevle(root.right,level+1);
		
		
		
	}
}
