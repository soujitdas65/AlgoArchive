class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans=1;
        List<Integer> list=new ArrayList<>();
        list.add((int)ans);
        for(int i=0;i<rowIndex;i++){
            ans*=rowIndex-i;
            ans/=i+1;
            list.add((int)ans);
        }
        return list;
    }
}