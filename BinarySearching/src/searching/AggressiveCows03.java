package searching;
import java.util.*;

public class AggressiveCows03 {

    // check function (same as isPossible)
    public static boolean isPossible(int dist, int[] arr, int cows) {
        int n = arr.length;
        int count = 1;          // first cow
        int last = arr[0];      // first position

        for (int i = 1; i < n; i++) {
            if (arr[i] - last >= dist) {
                count++;
                last = arr[i];
            }
        }
        if(count >= cows) return true;
        else return false;
    }

    public static int aggressiveCows(int[] arr, int cows) {
        int n = arr.length;
        Arrays.sort(arr);   // IMPORTANT

        int lo = 1;
        int hi = arr[n - 1] - arr[0];
        int ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (isPossible(mid, arr, cows)) {
                ans = mid;        // store answer
                lo = mid + 1;     // maximize distance
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 4, 9};
        int cows = 3;

        int result = aggressiveCows(arr, cows);
        System.out.println(result);  // Output: 3
    }
}