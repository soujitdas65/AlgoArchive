class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        find(result,new ArrayList<>(),0,candidates,target);
        return result;
    }
    void find(List<List<Integer>> result,List<Integer> list,int start,int[] nums,int target) {
        if(target==0) {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<nums.length;i++) {
            if(i>start && nums[i-1]==nums[i]) continue;
            if(nums[i]>target) break;
            list.add(nums[i]);
            find(result,list,i+1,nums,target-nums[i]);
            list.remove(list.size()-1);
        }
    }
}