class Solution {
    public double myPow(double x, int n) {
        double ans=1.0d;
        long m=n;
        if(m<0) m=m*-1;
        while(m>0){
            if(m%2==1) {
                ans=ans*x;
                m--;
            }
            while(m%2==0 && m>0) {
                m=m/2;
                x=x*x;
            }
        }
        if(n<0) return ans=1.0/ans;
        return ans;
    }
}