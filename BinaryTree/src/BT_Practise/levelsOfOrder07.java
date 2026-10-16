package BT_Practise;
import java.util.LinkedList;
import java.util.Queue;

public class levelsOfOrder07 {
	public static void main(String[] args) {
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
		
		System.out.print("Level Order Left to right : ");
		levelOrderLeftToRight(a);
		
		System.out.print("Level Order right to left : ");
		levelOrderRightToLeft(a);
	}
	
	private static void levelOrderLeftToRight(Node root) {
		Queue<Node> q = new LinkedList<>();
		if(root != null) q.add(root);
		while(q.size() > 0) {
			Node front = q.remove();
			System.out.print(front.val+" ");
			if(front.left != null) q.add(front.left);
			if(front.right != null) q.add(front.right);
		}
		System.out.println();
	}
	
	private static void levelOrderRightToLeft(Node root) {
		Queue<Node> q = new LinkedList<>();
		if(root != null) q.add(root);
		while(q.size() > 0) {
			Node front = q.remove();
			System.out.print(front.val+" ");
			// Right child first
	        if (front.right != null) q.add(front.right);
	        if (front.left != null) q.add(front.left);
		}
		System.out.println();
	}
}
