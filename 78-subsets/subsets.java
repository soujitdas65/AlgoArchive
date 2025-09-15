class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<(1<<nums.length);i++) {
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<nums.length;j++) {
                if((i & (1<<j))!=0) temp.add(nums[nums.length-1-j]);
            }
            result.add(temp);
        }
        return result;
    }
}