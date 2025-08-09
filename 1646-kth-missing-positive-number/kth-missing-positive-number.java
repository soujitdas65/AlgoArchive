class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=1,high=arr.length,ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid-1]-mid<k) low=mid+1;
            else high=mid-1;
        }
        return k+high;
    }
}