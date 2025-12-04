package BasicsOfArrays;

import java.util.Scanner;

public class maxInArray08 {

	public static void main(String[] args) {
		/*
		 * Find the maximum value out of all the
		 * elements in the array.
		 */
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Array Size : ");
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 System.out.print("Enter Array elements : ");
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt(); 
		 }
		 
//		 // 1st solution
//		 int mx = arr[0];
//		 for(int i=1;i<n;i++) {
//			 if(arr[i]>mx) mx = arr[i];
//		 }
//		 System.out.println(mx);
//	}
	
	// 2nd solution
			 int mx = Integer.MIN_VALUE;
			 for(int i=1;i<n;i++) {
				 //if(arr[i]>mx) mx = arr[i];
				 mx = Math.max(mx, arr[i]);
			 }
			 System.out.println(mx);
		}
	
	

}
