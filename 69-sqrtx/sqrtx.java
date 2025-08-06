class Solution {
    public int mySqrt(int x) {
        int low=1,high=x,ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid>x/mid) high=mid-1;
            else if(mid<=x/mid) {
                low=mid+1;
                ans=mid;
            }
            else break;
        }
        return ans;
    }
}