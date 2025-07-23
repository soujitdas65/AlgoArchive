class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows=new ArrayList<>();
        List<Integer> columns=new ArrayList<>();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        int count=0;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (columns.contains(j) || rows.contains(i)) matrix[i][j]=0;
            }
        }
    }
}