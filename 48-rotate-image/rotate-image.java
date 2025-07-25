class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        //rotate
        for (int i=0;i<m/2;i++){
            for (int j=0;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[m-1-i][j];
                matrix[m-1-i][j]=temp;
            }
        }
        //transpose
        for (int i=0;i<m;i++){
            for (int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}