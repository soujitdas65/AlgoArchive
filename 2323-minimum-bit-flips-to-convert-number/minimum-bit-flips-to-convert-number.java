class Solution {
    public int minBitFlips(int start, int goal) {
        int result=start^goal,cnt=0,i=0;
        while(i<32) {
            cnt+=(result & (1<<i))!=0 ? 1:0;
            i++;
        }
        return cnt;
    }
}