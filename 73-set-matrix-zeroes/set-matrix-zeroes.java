class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        //marking in arrays
        int x[]=new int [n];
        int y[]=new int [m];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    x[j]=1;
                    y[i]=1;
                }
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(x[j]==1 || y[i]==1) matrix[i][j]=0;
            }
        }
    }
}