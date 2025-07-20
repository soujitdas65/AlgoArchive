class Solution {
    public int missingNumber(int[] nums) {
        SortedSet<Integer> n=new TreeSet<>();
        for (int i=0;i<nums.length;i++) n.add(nums[i]);
        List<Integer> list=new ArrayList<>();
        int j=0;
        for (int i:n) list.add(i);
        for (int i=1;i<list.size();i++) {
            if ((list.get(i)-list.get(i-1))!=1) return list.get(i)-1;
        }
        if(list.get(0)==0) return list.get(list.size()-1)+1;
        return list.get(0)-1;
    }
}