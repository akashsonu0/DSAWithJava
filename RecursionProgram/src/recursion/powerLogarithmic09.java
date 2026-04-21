package recursion;
import java.util.Scanner;
public class powerLogarithmic09 {
	
	public static int pow(int a,int b ) {
		if(b==0) return 1; // base case 
		int ans = pow(a,b/2);
		if(b%2==0) return ans * ans;
		else return ans * ans * a; // work and call 
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
