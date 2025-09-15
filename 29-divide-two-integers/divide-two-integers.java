class Solution {
    public int divide(int dividend, int divisor) {
        long sign=1;
        if(dividend<0 && divisor>0) sign=-1;
        if(dividend>=0 && divisor<0) sign=-1;
        long D=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        long quotient=0;
        long n=D;
        while(n>=d){
            long k=0;
            while(n>=d<<(k+1)) k++;
            quotient+=1L<<k;
            n-=d<<k;
        }
        long result=sign*quotient;
        if(result>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(result<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)result;
    }
}