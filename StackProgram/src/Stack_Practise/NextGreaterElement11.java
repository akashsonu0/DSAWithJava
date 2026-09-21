package Stack_Practise;
import java.util.Stack;
public class NextGreaterElement11 {
    public static void nextGreater(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        // Last element ka koi next greater nahi hota
        st.push(arr[n - 1]);
        System.out.print("-1 ");
        for (int i = n - 2; i >= 0; i--) {
            // Chhote ya equal elements ko remove karo
            while (!st.isEmpty() && st.peek() <= arr[i]) 
                st.pop();
            
            // Next greater element print karo
            if (st.isEmpty()) System.out.print("-1 ");
            else System.out.print(st.peek() + " ");
            // Original element stack mein push karo
            st.push(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 20, 40, 12, 30};
        int n = arr.length;
        nextGreater(arr, n);
    }
}