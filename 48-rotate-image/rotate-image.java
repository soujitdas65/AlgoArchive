class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length, m=matrix[0].length;
        //rotate
        for(int i=0;i<m/2;i++){
            for(int j=0;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[m-i-1][j];
                matrix[m-i-1][j]=temp;
            }
        }
        //transpose
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
    