package Stack_Practise;

public class ArrayListImplementation09 {

    public static class stack {

        private int[] arr = new int[5];
        private int idx = 0;

        // Push element into stack
        void push(int x) {

            if (isFull()) {
                System.out.println("Stack is full...");
                return;
            }

            arr[idx] = x;
            idx++;
        }

        // Returns top element without removing it
        int peek() {

            if (idx == 0) {
                System.out.println("The stack is empty!!");
                return -1;
            }

            return arr[idx - 1];
        }

        // Removes and returns top element
        int pop() {

            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = arr[idx - 1];

            arr[idx - 1] = 0;
            idx--;

            return top;
        }

        // Displays all elements
        void display() {

            for (int i = 0; i <= idx - 1; i++) {
                System.out.println(arr[i]);
            }
        }

        // Returns current size
        int size() {
            return idx;
        }

        // Checks whether stack is empty
        boolean isEmpty() {

            if (idx == 0)
                return true;
            else
                return false;
        }

        // Checks whether stack is full
        boolean isFull() {

            if (arr.length == idx)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {

        // Creating object of our custom stack class
        stack st = new stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
       
        System.out.println("Peek: " + st.peek());

        System.out.println("Size: " + st.size());

        System.out.println("Pop: " + st.pop());

        System.out.println("Size after pop: " + st.size());

        //st.display();
        
        System.out.println(st.isEmpty());
        
        st.push(50);
        
        st.push(60);
        
        st.display();
        
        System.out.println(st.isFull());
        
        st.push(0);
    }
}