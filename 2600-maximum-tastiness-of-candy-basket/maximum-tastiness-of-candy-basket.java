class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int l=price.length;
        int low=1,high=price[l-1]-price[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            int last=price[0],count=1;
            for(int i=1;i<l;i++){
                if(price[i]-last>=mid) {
                    count++;
                    if(count>=k) break;
                    last=price[i];
                }
            }
            if(count>=k) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
}