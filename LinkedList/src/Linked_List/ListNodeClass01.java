package Linked_List;
class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
	}
}

public class ListNodeClass01 {
	public static void main(String[] args) {
		Node a = new Node(10);
		System.out.println(a);
		System.out.println(a.val);
		System.out.println(a.next);
		Node b = new Node(20);
		System.out.println(b);
		
		System.out.println("--------------------------");
		Node a1 = new Node(10);
		Node b1 = new Node(20);
		a1.next = b1; // linking -> a -> b
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(a1.next);
		System.out.println(b1.next);
		
		System.out.println("--------------------------");
		Node a2 = new Node(10);
		Node b2 = new Node(20);	
		Node c2 = new Node(30);
		Node d2 = new Node(40);
		Node e2 = new Node(50);
		a2.next = b2; // 10 -> 20
		b2.next = c2; // 10 -> 20 -> 30
		c2.next = d2; // 10 -> 20 -> 30 -> 40
		d2.next = e2; // 10 -> 20 -> 30 -> 40 -> 50
		
		System.out.println(a2.val);
		System.out.println(a2.next.val);
		System.out.println(a2.next.next.val);
		System.out.println(a2.next.next.next.val);
		System.out.println(a2.next.next.next.next.val);
					
	}

}
