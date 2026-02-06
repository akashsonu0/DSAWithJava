package TwoDArrays;

public class setMatrixZero15 {public static void print(int[][] arr) {
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
		int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
		int m = arr.length , n = arr[0].length;
		print(arr);
		 // Method-1
        // we use extra 2D-Array
        int[][] helper = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                helper[i][j]=arr[i][j];
            }
        } 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(helper[i][j]==0){
                    //set the ith row and jth col to 0 in arr
                    // for columns
                    for(int b=0;b<n;b++){
                        arr[i][b]=0;
                    }
                    // for rows
                    for(int a=0;a<m;a++){
                        arr[a][j]=0;
                    }
                }
            }
        }  
        print(arr);
        // 2nd-Method
       /* boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        // marking the particular row and column
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             if(arr[i][j]==0){
                row[i]=true;
                col[j]=true;
                }
            }
        } 
        // set the 'true' rows to 0
        for(int i=0;i<m;i++){
            if(row[i]==true){ // set the ith row to 0
            for(int j=0;j<n;j++){
                arr[i][j] = 0;
              }
           }
        }
        // set the 'true' cols to 0
        for(int j=0;j<n;j++){
            if(col[j]==true){ // set the jth cols to 0
            for(int i=0;i<m;i++){
                arr[i][j] = 0;
              }
           }
        }*/
	}

}
