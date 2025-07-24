class Solution {
    public void setZeroes(int[][] matrix) {
        int c=1;
        int m=matrix.length;
        int n=matrix[0].length;
        //marking elements
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0) matrix[0][j]=0;
                    else c=0;
                }
            }
        }
        //converting the non-zero elements to zero
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (matrix[i][j]!=0){
                    if (matrix[0][j]==0 || matrix[i][0]==0) matrix[i][j]=0;
                }
            }
        }
        //marking first row
        if(matrix[0][0]==0) {
            for (int i=0;i<n;i++) matrix[0][i]=0;
        }
        //marking first column
        if (c==0){
            for (int j=0;j<m;j++) matrix[j][0]=0;
        }
    }
}