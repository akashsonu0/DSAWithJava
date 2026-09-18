package Stack_Practise;

public class LinkedListImplementation10 {
	public static class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
			this.next = null;
		}
	}
	
	public static class Stack{
		Node head = null;
		int size = 0;
		
		void push(int x) {
			Node temp = new Node(x);
			temp.next = head;
			head = temp;
			size++;
		}
		
		int size() {
			return size;
		}
		
		int pop() {
			if(head == null) {
				System.out.println("Stack is empty");
				return -1;
			}
			int x = head.val;
			head = head.next;
			size--;
			return x;
		}
		
		int peek() {
			if(head == null) {
				System.out.println("Stack is empty");
				return -1;
			}
			int x = head.val;
			return x;
		}
		
		boolean isEmpty() {
			if(size == 0) return true;
			else return false;
		}
		
		void display(){
			displayRec(head);
		}
		
		void displayRec(Node h) {
			if(h == null) return;
			displayRec(h.next);
			System.out.println(h.val);
		}
	}
	public static void main(String[] args) {
    	// Creating object of our custom stack class
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
       
        System.out.println("Peek: " + st.peek());

        System.out.println("Size: " + st.size());

        System.out.println("Pop: " + st.pop());

        System.out.println("Size after pop: " + st.size());
        
        System.out.println(st.isEmpty());
        
        st.push(50);
        
        st.push(60);
        
        st.display();
        
    }
}