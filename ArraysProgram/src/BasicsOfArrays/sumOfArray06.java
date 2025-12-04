package BasicsOfArrays;

public class sumOfArray06 {

	public static void main(String[] args) {
		/*
		  Calculate the sum of all the elements in
		  the given array.
		*/
		
		int[] arr = {10,20,30,40,50};
		int n = arr.length;
		int sum =0;
		for(int i=0;i<n;i++) {
			sum +=arr[i];
		}
		System.out.print(sum);
	}

}
