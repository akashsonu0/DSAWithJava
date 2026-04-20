package recursion;
import java.util.Scanner;
public class printOneToN04 {
	
	// 1st method (Global Variable)
	/*static int n; // global variable
	public static void print(int x) {
		if(x>n) return; // base case
		System.out.print(x+" "); // work
		print(x+1); // call
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
	    n = sc.nextInt(); // local variable
		print(1); */
	
	// 2nd and best method(Extra Parameter)
	public static void print(int x,int n) {
		if(x>n) return; // base case
		System.out.print(x+" "); // work
		print(x+1,n); // call
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
	    int n = sc.nextInt(); // local variable
		print(1,n);
	}

}
