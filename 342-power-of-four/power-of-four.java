class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0 || (n-1)%3!=0) return false;
        int check=(n-1) & n;
        return check==0;
    }
}