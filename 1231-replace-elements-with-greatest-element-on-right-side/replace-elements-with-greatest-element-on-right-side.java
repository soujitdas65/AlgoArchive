class Solution {
    public int[] replaceElements(int[] arr) {
        int l=arr.length,j=-1;
        for(int i=l-1;i>=0;i--){
            if (arr[i]>j) {
                int temp=arr[i];
                arr[i]=j;
                j=temp;
            }
            else arr[i]=j;
        }
        return arr; 
    }
}