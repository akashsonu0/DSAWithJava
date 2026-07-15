package Linked_List;
// Singly Linked List
class SLL{ // we will use as user defined data structure
	Node head;
	Node tail;
	int size;
	void insertAtEnd(int val) {
		Node temp = new Node(val);
		if(head==null) head = tail = temp;
		else {
			tail.next = temp;
			tail = temp;
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
		System.out.println(list.size);
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.display();
		System.out.println(list.size);
		list.insertAtEnd(24);
		list.display();
		System.out.println(list.size);
	}

}
