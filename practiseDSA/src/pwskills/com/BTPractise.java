package pwskills.com;
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
class SLL{
	private Node head;
	private Node tail;
	private int size;
	void insertAtTail(int val) {
		Node temp = new Node(val);
		if(head == null) {
			head = tail = temp;
		}
		else {
			tail.next = temp;
			tail = temp;
		}
	}
	
	void insertAtHead(int val) {
		Node temp = new Node(val);
		if(head == null) {
			head = tail = temp;
		}
		else {
			temp.next = head;
			head = temp;
		}
	}
	
	void insert(int idx, int val) {
		if(idx == 0) {
			insertAtHead(val);
			return;
		}
		if(idx == size) {
			insertAtTail(val);
			return;
		}
		if(idx < 0 || idx > size) {
			System.out.println("Invalid idx");
			return;
		}
		Node temp = new Node(val);
			Node x = head;
			for(int i=1;i<=idx-1;i++) {
				x = x.next;
			}
			temp.next = x.next;
			x.next = temp;
		}
		
	int get(int idx) throws Error{
		if(idx >= size || idx < 0) {
			throw new Error("Invalid index");
		}
		if(idx == 0) return head.val;
		if(idx == size-1) return tail.val;
		Node temp = head;
		for(int i=0;i<=idx-1;i++) {
			temp = temp.next;
		}
		return temp.val;
	}
	
	void set(int idx , int val) throws Error{
		if(idx == 0) head.val = val;
		if(idx == size-1) tail.val = val;
		if(idx >= size || idx < 0) {
			throw new Error("Invalid index");
		}
		Node temp = head;
		for(int i=0;i<=idx;i++) {
			temp = temp.next;
		}
		 temp.val = val;
	}
	
	void deleteAtHead() throws Error{
		if(head == null) throw new Error("List is Empty");
		head = head.next;
	}
	
	void delete(int idx) throws Error{
		if(idx == 0) {
			deleteAtHead();
			return;
		}
		if(idx >= size || idx < 0) {
			throw new Error("Invalid index");
		}
		Node temp = head;
		for(int i=0;i<=idx-1;i++) {
			temp = temp.next;
		}
		if(tail == temp.next) tail = temp;
		temp.next = temp.next.next;
	}
	
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}
public class BTPractise {
	public static void main(String[] args) {
		SLL list = new SLL();
		list.insertAtTail(10);
		list.insertAtTail(20);
		list.insertAtTail(30);
		list.display();
		list.insertAtTail(40);
		list.display();
		list.insertAtHead(50);
		list.display();
		list.insert(2, 100);
		list.display();
		list.insert(4, 80);
		list.display();
		list.insert(10, 23);
		list.display();
		
		System.out.println(list.get(3));
		//System.out.println(list.get(30));
		
		list.set(2, 90);
		list.display();
		
		list.deleteAtHead();
		list.display();
		
		list.delete(2);
		list.display();
	}
}
