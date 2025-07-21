class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int num[]=new int[n+1];
        num[0]=0;
        for (int i=0;i<n;i++) num[nums[i]]++;
        for (int i=1;i<=n;i++) {
            if (num[i]==0) list.add(i);
        }
        return list;
    }
}