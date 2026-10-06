package BT_Practise;

public class ProductOfTree03 {

	public static void main(String[] args) {
		Node a = new Node(1); // a is the root
		Node b = new Node(41);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(6);
		Node f = new Node(5);
		Node g = new Node(10);
		Node h = new Node(20);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.right = f;
		c.left = g; e.right = h;
		
		display(a);
		System.out.println();
		// a.left = null;
		System.out.println(product(a));
	}
	
	
	private static int product(Node root) {
		if(root == null) return 1;
		return root.val * product(root.left) * product(root.right);
	}
	
	private static void display(Node root) {
		if(root == null) return; // Base case
		System.out.print(root.val+" "); // self
		display(root.left); // left subtree
		display(root.right); // right subtree

	}

}
