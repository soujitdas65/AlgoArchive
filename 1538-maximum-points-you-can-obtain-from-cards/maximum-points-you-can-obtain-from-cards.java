class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len=cardPoints.length,sum=0;
        for(int i=len-k;i<len;i++) sum+=cardPoints[i];
        int maxSum=sum;
        for(int i=0;i<k;i++) {
            sum=sum-cardPoints[len-k+i]+cardPoints[i];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}