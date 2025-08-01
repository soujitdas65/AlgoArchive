class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0;i<n;i++) {
            nums1[m+i]=nums2[i];
        }
        int gap=(m+n)/2;
        while(gap>0){
            int left=0,right=left+gap;
            while(right<m+n){
                if(nums1[left]>nums1[right]){
                    int temp=nums1[left];
                    nums1[left]=nums1[right];
                    nums1[right]=temp;
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap=gap/2+gap%2;
        }
    }
}