class Solution {
    public int maximum69Number (int num) {
        int n=(int)(Math.log(num)/Math.log(10))+1,ans=0,count=0;
        while(n-->0){
            int d=(int)Math.pow(10,n);
            if(num/d==6 && count==0) {
                ans=ans+9*d;
                count=1;
            }
            else ans=ans+(num/d)*d;
            num=num%d;
        }
        return ans;
    }
}