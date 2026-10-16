package BT_Practise;

import java.util.Scanner;

public class PrintElementOfNthLevel08 {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node a = new Node(1); // a is the root
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
		nThLevel(a,0);
		
		
		// ye code sara level ko order mein print krwa k de dega
		/*
		  for(int x=0;x<=3;x++){
		  	n = x;
		  	nThLevel(a,0);
		  	System.out.println();
		 */
		
	}
	
	private static void nThLevel(Node root , int level) {
		// preorder ya inorder ya postorder kuch bhi likh do same hi aayega 
		if(root == null) return; 
		if(level == n) System.out.print(root.val+" "); 
		nThLevel(root.left ,level+1); 
		nThLevel(root.right ,level+1); 
		
	}
}
