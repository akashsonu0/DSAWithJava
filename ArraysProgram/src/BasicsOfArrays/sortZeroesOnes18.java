package BasicsOfArrays;

public class sortZeroesOnes18 {

	public static void main(String[] args) {
		int[] arr = {0,0,0,1,1,1};
		int n = arr.length;
		//1st method
//		int noOfZeroes = 0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]==0) noOfZeroes++;
//		}
//		for(int i=0;i<n;i++) {
//			if(i<noOfZeroes) arr[i]=0;
//			else arr[i]=1;
//		}
//		for(int ele : arr) {
//			System.out.print(ele+ " ");
//		}
//		System.out.println();
//		
		
		
		//2nd Method one pass solution using two pointers
		int i=0, j=n-1;
		while(i<j) {
			if(arr[i]==0) i++;
			if(arr[j]==1) j--;
			//if(i<) break;
			if(i<j && arr[i]==1 && arr[j]==0) {
				arr[i]=0;
				arr[j]=1;
				i++;
				j--;
			}
		}
		for(int ele : arr) {
			System.out.print(ele+ " ");
		}
		System.out.println();
	}
}
