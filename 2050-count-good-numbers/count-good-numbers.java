class Solution {
    static final long mod=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2, odd=n/2;
        long firstHalf=calPow(5,even,1);
        long secondHalf=calPow(4,odd,1);
        return (int)((firstHalf*secondHalf)%mod);
    }
    long calPow(long base, long exp, long ans) {
        base%=mod;
        if(exp==0) return ans;
        if(exp%2==1) ans=(ans*base)%mod;
        return calPow(base*base,exp/2,ans);
    }
}