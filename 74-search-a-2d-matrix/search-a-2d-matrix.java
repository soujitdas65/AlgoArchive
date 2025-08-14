class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int low=0,high=n*m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int rows=mid/n,columns=mid%n;
            if(matrix[rows][columns]==target) return true;
            else if(matrix[rows][columns]>target)high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}