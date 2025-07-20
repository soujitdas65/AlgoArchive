class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer> list=new ArrayList<>();
        while(i<n1 &&j<n2){
            if (nums1[i]==nums2[j]) {
                if (list.contains(nums1[i]));
                else list.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i]>nums2[j]) j++;
            else i++;
        }
        int nums3[]=new int[list.size()];
        for (int k=0;k<list.size();k++) {
            if (k==0) nums3[k]=list.get(k);
            else if (list.get(k)!=nums3[k-1]) nums3[k]=list.get(k);
        }
        return nums3;
    }
}