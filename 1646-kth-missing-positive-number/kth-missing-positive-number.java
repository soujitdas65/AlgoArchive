class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=1,high=arr.length+k,ans=0;
        while(low<=high){
            int mid=low+(high-low)/2,count=0;
            for(int i=0;i<arr.length;i++) {
                if(arr[i]<mid) count++;
                else break;
            }
            if(mid-count<=k) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
}