package BasicsOfArrays;

public class initialiseArray03 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
		int n = arr.length;
		System.out.println(n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 2nd Method
		System.out.println();
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
