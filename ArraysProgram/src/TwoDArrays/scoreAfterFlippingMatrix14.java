package TwoDArrays;

public class scoreAfterFlippingMatrix14 {
	public static void print(int[][] arr) {
		int m = arr.length, n = arr[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
     public static void main(String[] args) {
	 int[][] arr = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
	 int m = arr.length , n = arr[0].length;
	 print(arr);
	 //Make First Column All 1s (Row Flip)
	 //put 1 at zeroes positions of every row
	 for(int i=0;i<m;i++) {
		 if(arr[i][0]==0) { // flip that row
			 for(int j=0;j<n;j++) {
				 if(arr[i][j]==0) arr[i][j]=1;
				 else arr[i][j]=0;
			 }	 
		 }
	 }
	print(arr);
	//flip those columns where (noOfZeroes > noOfOnes)
	for(int j=1;j<n;j++) {
	   int noOfZeroes=0, noOfOnes=0;
	   for(int i=0;i<m;i++) {		   
		   if(arr[i][j]==0) noOfZeroes++;
		   else noOfOnes++;
	   }
	   if(noOfZeroes>noOfOnes) { //flip that columns
		   for(int i=0;i<m;i++) {
			   if(arr[i][j]==0) arr[i][j]=1;
				 else arr[i][j]=0;
		  }
	   }
	}
	print(arr);
	//calculating score
	// Final matrix ko binary numbers ki tarah treat karke total score nikal rahe hain

	int score = 0;   // Yaha total sum store hoga (final answer)
	int x = 1;       // Ye current column ka weight hai (2^0 se start = 1)

	// Columns ko right se left traverse kar rahe hain
	// Kyunki binary me rightmost bit ki value sabse chhoti hoti hai (1, 2, 4, 8...)
	for (int j = n - 1; j >= 0; j--) {

	    // Har column ke har row ke element ko check kar rahe hain
	    for (int i = 0; i < m; i++) {

	        // Agar cell me 1 hai to us column ka weight (x) score me add hoga
	        // Agar 0 hai to kuch add nahi hoga
	        // Iska matlab: har 1 apni binary position ke according contribute karega
	        score += (arr[i][j] * x);
	    }

	    // Ab next left column ka weight double hoga
	    // Example: 1 → 2 → 4 → 8 → 16 ...
	    x *= 2;
	}

	// Final maximum possible score print kar diya
	System.out.println(score);

  }
}


