package BT_Practise;
public class productofNonZeroElements04 {
	public static void main(String[] args) {
		Node a = new Node(2);
		Node b = new Node(0);
		Node c = new Node(4);
		Node d = new Node(3);
		Node e = new Node(5);
		Node f = new Node(0);
		Node g = new Node(6);
		Node h = new Node(7);

		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = f; c.right = g;
		f.right = h;
		
		display(a);
		System.out.println();
		System.out.println(productNonZero(a));
	}
	
	private static int productNonZero(Node root) {
		 if(root == null) return 1;

		    int self = (root.val == 0) ? 1 : root.val;

		    return self
		            * productNonZero(root.left)
		            * productNonZero(root.right);
	}
	
	private static void display(Node root) {
		if(root == null) return; // Base case
		System.out.print(root.val+" "); // self
		display(root.left); // left subtree
		display(root.right); // right subtree
	}

}
