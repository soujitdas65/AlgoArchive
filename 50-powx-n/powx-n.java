class Solution {
    public double myPow(double x, int n) {
        if(n==0 || x==1.0) return 1.0;
        if(n==Integer.MIN_VALUE) {
            n=n+1;
            n=n*-1;
            return (1/x)*1/power(x,n);
        }
        if(n<0) {
            n=n*-1;
            return 1/power(x,n);
        }
        else return power(x,n);
    }
    double power(double x, int n) {
        if(n==1) return x;
        if(n%2==0) return power(x*x,n/2);
        else return x*power(x,n-1);
    }
}