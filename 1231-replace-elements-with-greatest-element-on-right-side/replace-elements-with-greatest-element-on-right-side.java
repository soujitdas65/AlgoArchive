class Solution {
    public int[] replaceElements(int[] arr) {
        int i=arr.length,max=Integer.MIN_VALUE,temp=-1;
        while(i-->0){
            max=Math.max(max,temp);
            temp=arr[i];
            arr[i]=max;
        }
        return arr;
    }
}