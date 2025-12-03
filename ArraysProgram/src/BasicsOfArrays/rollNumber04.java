package BasicsOfArrays;

public class rollNumber04 {

	public static void main(String[] args) {
			
		/* Given an array of marks of students, if the marks of any
		   student is less than 35 print its roll number.
		   [roll number here refers to the index of the array].
		*/
		int[] arr = {81,45,17,100,12,34};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]<35) System.out.print(i + " ");
		}
	}

}
