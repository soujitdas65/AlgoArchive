class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int low1=0,high1=m-1;
        while(low1<=high1){
            int mid1=low1+(high1-low1)/2;
            if(target>=matrix[mid1][0]) low1=mid1+1;
            else high1=mid1-1;
        }
        if(high1==-1 || high1==m) return false;
        int low2=0,high2=n-1;
        while(low2<=high2){
            int mid2=low2+(high2-low2)/2;
            if(target>=matrix[high1][mid2]) low2=mid2+1;
            else high2=mid2-1;
        }
        if(high2==-1 || high2==n) return false;
        if(target==matrix[high1][high2]) return true;
        return false;
    }
}