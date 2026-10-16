package pwskills.com;

class Node{
	int val;
	Node left;
	Node right;
	Node(int val){
		this.val = val;
	}
}
public class BTPractise {
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(41);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(6);
		Node f = new Node(5);
		Node g = new Node(10);
		Node h = new Node(20);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = g; c.right =f;
		e.right =h; 
		display(a);
		System.out.println();
		System.out.println(levels(a));
		System.out.println(max(a));
		System.out.println(size(a));
	}
	public static void display(Node root) {
		if(root == null) return;
		System.out.print(root.val+" ");
		display(root.left);
		display(root.right);
	}
	
	public static int levels(Node root) {
		if(root == null) return 0;
		return 1 + Math.max(levels(root.left), levels(root.right));
	}
	
	public static int max(Node root) {
		if(root == null) return Integer.MIN_VALUE;
		int a = root.val;
		int b = max(root.left);
		int c = max(root.right);
		return Math.max(a, Math.max(b,c));
	}
	
	public static int size(Node root) {
		if(root == null) return 0;
		return 1 + size(root.left) + size(root.right);
	}

}
