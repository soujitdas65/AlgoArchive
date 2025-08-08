class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=maximum(piles),ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hours=0;
            for (int i=0;i<piles.length;i++){
                hours+=(long)Math.ceil((double)piles[i]/mid);
            }
            if(hours>h) low=mid+1;
            else {
                ans=Math.min(mid,ans);
                System.out.println(ans);
                high=mid-1;
            }
        }
        return ans;
    }
    int maximum(int piles[]){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }
}