package recursion;
import java.util.Scanner;
public class PowerLinear08 {
	
	public static int pow(int a,int b ) {
//		if(a==0 && b==0) {
//			System.out.println("Not Defined");
//			return -1;
//		}
		if(b==0) return 1; // base case 
		return a * pow(a,b-1); // work and call 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base : ");
	    int a = sc.nextInt(); 
	    System.out.print("Enter power : ");
	    int b = sc.nextInt(); 
		System.out.println(pow(a,b));
	}

}
