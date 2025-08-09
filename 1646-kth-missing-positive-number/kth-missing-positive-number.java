class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0,j=1,count=0;
        while(count<k){
            if(i<arr.length && arr[i]==j) i++;
            else count++;
            j++;
        }
        return j-1;
    }
}