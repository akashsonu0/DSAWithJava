package BasicsOfArrays;

import java.util.Arrays;

public class builtInMethods11 {

	public static void main(String[] args) {
//		int[] arr = {30,10,40,23,89,34};
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
//		Arrays.sort(arr);
//		System.out.println();
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		int[] arr = {30,10,40,23,89,34};
		// forEach loop <for int element in array>
		for(int ele: arr) {
			System.out.print(ele + " ");
		}
		Arrays.sort(arr);
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
