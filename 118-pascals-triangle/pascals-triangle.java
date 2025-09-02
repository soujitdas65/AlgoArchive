class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainList=new ArrayList<>();
        for(int i=0;i<numRows;i++) {
            List<Integer> list=new ArrayList<>();
            int ans=1;
            list.add(ans);
            for(int j=0;j<i;j++) {
                ans*=(i-j);
                ans/=(j+1);
                list.add(ans);
            }
            mainList.add(list);
        }
        return mainList;
    }
}