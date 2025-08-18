class Solution {
    public int longestConsecutive(int[] nums) {
        SortedSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++) set.add(nums[i]);
        int max=0,count=1;
        for (int i:set) {
            if(set.contains(i-1)) count++;
            else count=1;
            max=Math.max(count,max);
        }
        return max;
    }
}