class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int m=matrix.length, n=matrix[0].length;
        int top=0, left=0, right=n-1, bottom=m-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++) list.add(matrix[top][i]);
            top++;
            if(top>bottom) break;
            for(int i=top;i<=bottom;i++) list.add(matrix[i][right]);
            right--;
            if(left>right) break;
            for(int i=right;i>=left;i--) list.add(matrix[bottom][i]);
            bottom--;
            if(top>bottom) break;
            for(int i=bottom;i>=top;i--) list.add(matrix[i][left]);
            left++;
            if(left>right) break;
        }
        return list;
    }
}