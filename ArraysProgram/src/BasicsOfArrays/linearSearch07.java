package BasicsOfArrays;

import java.util.Scanner;

public class linearSearch07 {

	public static void main(String[] args) {
		/* Find the element 'X' in the array. Take
		 * array and X as input.
		 */
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter target element : ");
		 int x = sc.nextInt();
		 System.out.print("Enter Array Size : ");
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 System.out.print("Enter Array elements : ");
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 // solution
		 boolean flag = false; // false means element not found
		 for(int i=0;i<n;i++) {
			 if(arr[i]==x) {
				 flag = true; // true means element found
				 break;
			 }
		 }	
		 if(flag==true) System.out.println("Element found");
		 else System.out.println("Element not found");
	}
}
