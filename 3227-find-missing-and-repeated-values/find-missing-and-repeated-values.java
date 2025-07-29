class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        int n=grid.length;
        int xor=0;
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n*n;i++){
            if(list.contains(grid[(i-1)/n][(i-1)%n])) {
                ans[0]=grid[(i-1)/n][(i-1)%n];
                list.add(grid[(i-1)/n][(i-1)%n]);
            }
            else list.add(grid[(i-1)/n][(i-1)%n]);
            xor=xor^i^list.get(i-1);
        }
        ans[1]=xor^ans[0];
        return ans;
    }
}