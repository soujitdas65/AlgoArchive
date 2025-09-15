class Solution {
    public int hammingDistance(int x, int y) {
        int result=x^y,cnt=0,i=0;
        while(i<32) {
            cnt+=(result & (1<<i))!=0 ? 1:0;
            i++;
        }
        return cnt;
    }
}