package BT_Practise;
public class TraversalOfATree06 {
	public static void main(String[] args) {
		Node a = new Node(1); // a is the root
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		Node g = new Node(7);
		
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = f; c.right = g;
		
		System.out.print("Preorder : ");
		preorder(a);
		System.out.println();
		
		System.out.print("Inorder : ");
		inorder(a);
		System.out.println();
		
		System.out.print("Postorder : ");
		postorder(a);
		
	}
	
	private static void preorder(Node root) {
		if(root == null) return; 
		System.out.print(root.val+" "); 
		preorder(root.left); 
		preorder(root.right); 
	}
	
	private static void inorder(Node root) {
		if(root == null) return; 
		inorder(root.left); 
		System.out.print(root.val+" "); 
		inorder(root.right); 
	}
	
	private static void postorder(Node root) {
		if(root == null) return; 
		postorder(root.left); 
		postorder(root.right); 
		System.out.print(root.val+" "); 
	}
	

}
