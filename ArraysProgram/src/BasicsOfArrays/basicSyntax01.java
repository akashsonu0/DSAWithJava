package BasicsOfArrays;

public class basicSyntax01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		// Initializing individual elements
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// Output of arrays elements
		System.out.print(arr[0] + " ");
		System.out.print(arr[1] + " ");
		System.out.print(arr[2] + " ");
		System.out.print(arr[3] + " ");
		System.out.print(arr[4] + " ");
		// Update 
		arr[0] = 99;
		System.out.print(arr[0] + " ");
		arr[0] += 10;
		System.out.print(arr[0] + " ");
		
	}

}
