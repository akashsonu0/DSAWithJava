package Queue_Practise;

public class CircularQueueArray06 {

    public static class Cqa {

        int front = -1;
        int rear = -1;
        int size = 0;

        int[] arr = new int[5];

        // ADD
        public void add(int val) {

            // Queue full
            if (size == arr.length) {
                System.out.println("Array is full!!");
                return;
            }

            // First element
            else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            }

            // Normal insertion
            else if (rear < arr.length - 1) {
                arr[++rear] = val;
            }

            // Circular insertion
            else {
                rear = 0;
                arr[rear] = val;
            }

            size++;
        }

        // REMOVE
        public int remove() {

            if (size == 0) {
                System.out.println("Queue is empty!!");
                return -1;
            }

            int val = arr[front];

            // Circular movement of front
            if (front == arr.length - 1)
                front = 0;
            else
                front++;

            size--;

            return val;
        }

        // PEEK
        public int peek() {

            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }

        // DISPLAY
        public void display() {

            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }

            // No wrap-around
            if (front <= rear) {

                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }

            // Wrap-around
            else {

                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }

                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }

            System.out.println();
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.remove());
        q.add(5);
        q.add(6);
        q.display();
        q.remove();
        q.display();
        q.add(7);
        q.display();
        System.out.println(q.remove());
        q.add(8);
        q.display();
    }
}