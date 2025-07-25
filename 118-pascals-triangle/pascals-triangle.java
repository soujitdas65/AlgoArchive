class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            result.add(generateRows(i));
        }  
        return result;
    }
    List<Integer> generateRows(int rowIndex){
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