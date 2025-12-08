package practise;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		
		//WAP to print sum of digits of a given number.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int n= sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter Array elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int mx=Integer.MIN_VALUE;
		for(int i =0;i<n;i++) {
			mx = Math.max(mx, arr[i]);
		}
		int smx=Integer.MIN_VALUE;
		for(int i =0;i<n;i++) {
			if(arr[i] != mx)
			smx = Math.max(smx, arr[i]);
		}
		System.out.println(smx);
		System.out.println(mx);
		}
		
		}
		
	


