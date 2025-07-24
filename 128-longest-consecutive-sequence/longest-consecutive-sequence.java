class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
        int max=1;
        Set<Integer> unique=new HashSet<>();
        for (int i=0;i<nums.length;i++) unique.add(nums[i]);
        for (int i:unique) {
            if(!unique.contains(i-1)){
                int count=1;
                int x=i+1;
                while(unique.contains(x)){
                    x=x+1;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}