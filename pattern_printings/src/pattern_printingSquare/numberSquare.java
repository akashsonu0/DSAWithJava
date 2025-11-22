package pattern_printingSquare;

import java.util.Scanner;

public class numberSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) { //rows
			for(int j=1;j<=n;j++) { // columns
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		// if we print i what will happen 
		
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) { //rows
//			for(int j=1;j<=n;j++) { // columns
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}

	}

}
