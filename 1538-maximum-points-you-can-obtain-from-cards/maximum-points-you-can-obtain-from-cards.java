class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len=cardPoints.length,sum=0;
        int[] nums=new int[2*k];
        for(int i=len-k;i<len;i++) {
            nums[i-len+k]=cardPoints[i];
            sum+=cardPoints[i];
        }
        int maxSum=sum;
        for(int i=0;i<k;i++) {
            nums[k+i]=cardPoints[i];
            sum=sum-nums[i]+nums[k+i];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}