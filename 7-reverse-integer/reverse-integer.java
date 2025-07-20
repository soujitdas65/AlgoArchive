class Solution {
    public int reverse(int x) {
        long sum=0;
        while(x!=0){
            int d=x%10;
            sum=sum*10+d;
            x=x/10;
        }
        if (sum>=Integer.MIN_VALUE && sum<=Integer.MAX_VALUE);
        else sum=0;
        int rev=(int)sum;
        return rev;
    }
}