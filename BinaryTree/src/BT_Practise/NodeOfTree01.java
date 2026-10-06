package BT_Practise;
class Node{
	int val;
	Node left;
	Node right;
	Node(int val){
		this.val = val;
	}
}
public class NodeOfTree01 {
	public static void main(String[] args) {
		Node a = new Node(1); // a is the root
		Node b = new Node(41);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(6);
		Node f = new Node(5);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.right = f;
		
		Node g = new Node(10);
		Node h = new Node(20);
		c.left = g; e.right = h;
		
		//a.left = null;
		
		display(a);
		/*a.left.right.val = 56;
		System.out.println(e.val);
		System.out.println(a.left.right.val);*/
	}
	private static void display(Node root) {
		if(root == null) return; // Base case
		System.out.print(root.val+" "); // self
		display(root.left); // left subtree
		display(root.right); // right subtree
		
	}
}



