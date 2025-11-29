package compositePattern_printing;

import java.util.Scanner;

public class starPyramidnsp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		
		int nsp=n-1;
		int nst= 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nsp;j++) { // no. of spaces
				System.out.print(" " + " ");
			}
			for(int j=1;j<=nst;j++) { // no. of stars
				System.out.print("*" + " ");
			}
			System.out.println();	
			nsp--;
			nst+=2;
		}
	}

}
