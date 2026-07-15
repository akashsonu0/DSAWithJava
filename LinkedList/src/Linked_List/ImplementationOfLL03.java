package Linked_List;
// Singly Linked List
class SLL{ // we will use as user defined data structure
	private Node head;
	private Node tail;
	private int size;
	void insertAtTail(int val) {
		Node temp = new Node(val);
		if(head==null) head = tail = temp;
		else {
			tail.next = temp;
			tail = temp;
		}
		size++;
	}
	
	void insertAtHead(int val) {
		Node temp = new Node(val);
		if(head==null) head = tail = temp;
		else {
			temp.next = head;
			head = temp;
		}
		size++;
	}
	
	void display() {
		Node temp = head;
		while(temp != null){
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class ImplementationOfLL03 {
	public static void main(String[] args) {
		SLL list = new SLL();
//		System.out.println(list.size);
//		list.insertAtTail(10);
//		list.insertAtTail(20);
//		list.insertAtTail(30);
//		list.insertAtTail(40);
//		list.display();
//		System.out.println(list.size);
//		list.insertAtTail(24);
//		list.display();
//		System.out.println(list.size);
		
		list.insertAtTail(10);
		list.insertAtTail(20);
		list.insertAtTail(30);
		list.display();
		list.insertAtTail(40);
		list.display();
		list.insertAtHead(50);
		list.display();
	}

}
