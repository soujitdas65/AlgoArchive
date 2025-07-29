class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int l=grid.length;
        long s1=0,s2=0;
        for (int i=0;i<l;i++){
            for (int j=0;j<l;j++){
                s1+=grid[i][j];
                s2+=(long)grid[i][j]*grid[i][j];
            }
        }
        long n=l*l;
        long x=s1-n*(n+1)/2;
        long y=s2-n*(n+1)*(2*n+1)/6;
        int ar[]=new int[2];
        ar[0]=(int)(y/x+x)/2;
        ar[1]=(int)(y/x-x)/2;
        return ar;
    }
}