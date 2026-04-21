package recursion;
import java.util.Scanner;
public class Factorial02 {
	public static int fact(int n) {
		if(n==1 || n==0) return 1;  // base case
		int ans = n * fact(n-1); // work
		return ans; // call
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		System.out.println(fact(n));
	}

}
