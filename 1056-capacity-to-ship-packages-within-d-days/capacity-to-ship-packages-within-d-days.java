class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=weights.length;
        int low=Integer.MIN_VALUE,high=0;
        for (int i=0;i<l;i++) {
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            long sum=0,d=1;
            for (int i=0;i<l;i++) {
                if(sum+weights[i]>mid) {
                    d++;
                    sum=weights[i];
                }
                else sum+=weights[i];
            }
            if(d<=days) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}