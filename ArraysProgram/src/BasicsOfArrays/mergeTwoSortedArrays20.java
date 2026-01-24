package BasicsOfArrays;

public class mergeTwoSortedArrays20 {

	public static void main(String[] args) {
		int[] arr = {11,33,42,71};
		int[] brr = {26,54,69,81,94};
		int[] crr = new int[arr.length + brr.length];
		int i = 0, j = 0 , k = 0; 
		//merging
		while(i<arr.length && j<brr.length) {
			if(arr[i]<=brr[j]) {
				crr[k]=arr[i];
				i++;
				k++;
			}
			else {
				crr[k]=brr[j];
				j++;
				k++;
			}
			if(i==arr.length) { //now take elements from b only
				while(j<brr.length) {
					crr[k] = brr[j];
					j++;
					k++;
				}
			}
			if(i==brr.length) { //now take elements from a only
				while(i<arr.length) {
					crr[k] = arr[i];
					i++;
					k++;
				}
			}
		}
		for(int ele:crr) {
			System.out.print(ele+" ");
		}
	}

}
