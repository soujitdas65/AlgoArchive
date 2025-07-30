class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,n=x;
        while(x>0){
            sum=sum*10+(x%10);
            x=x/10;
        }
        if(sum==n) return true;
        return false;
    }
}