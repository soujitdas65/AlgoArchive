class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=nums.length;
        int low=1,high=Integer.MIN_VALUE;
        for (int i=0;i<l;i++) high=Math.max(high,nums[i]);
        while(low<=high){
            int mid=low+(high-low)/2;
            long sum=0;
            for(int i=0;i<l;i++){
                sum+=Math.ceil((double)nums[i]/mid);
            }
            if(sum<=threshold) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}