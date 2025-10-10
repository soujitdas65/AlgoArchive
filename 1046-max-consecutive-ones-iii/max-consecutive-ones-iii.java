class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,zero=0,max=Integer.MIN_VALUE,index=0;
        List<Integer> list=new ArrayList<>();
        while(j<nums.length) {
            if(nums[j]==0) {
                zero++;
                list.add(j);
            }
            if(zero>k) {
                i=list.get(index)+1;
                index++;
                zero--;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}