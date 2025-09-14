class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        int check=(n-1) & n;
        return check==0;
    }
}