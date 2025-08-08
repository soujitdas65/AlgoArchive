class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l=bloomDay.length;
        if(m>l/k) return -1;
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            high=Math.max(high,bloomDay[i]);
            low=Math.min(low,bloomDay[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2,count=0,num=0;
            for(int i=0;i<l;i++){
                if(bloomDay[i]<=mid) count++;
                else {
                    num+=count/k;
                    count=0;
                }
            }
            num+=count/k;
            System.out.println(num);
            if(num>=m) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}