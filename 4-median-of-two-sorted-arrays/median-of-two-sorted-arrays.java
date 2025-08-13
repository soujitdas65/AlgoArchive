class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length,b=nums2.length;
        List<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(i<a && j<b){
            if(nums1[i]<=nums2[j]) {
                list.add(nums1[i]);
                i++;
            }
            else {
                list.add(nums2[j]);
                j++;
            }
        }
        while(i<a){
            list.add(nums1[i]);
            i++;
        }
        while(j<b){
            list.add(nums2[j]);
            j++;
        }
        if((a+b)%2==1) return list.get((a+b-1)/2);
        else {
            int x=list.get((a+b)/2);
            int y=list.get((a+b)/2-1);
            return (x+y)/2.0;
        }
    }
}