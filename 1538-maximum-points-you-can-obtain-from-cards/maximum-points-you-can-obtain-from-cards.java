class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len=cardPoints.length,sum=0;
        int[] nums=new int[2*k];
        for(int i=len-k;i<len;i++) {
            nums[i-len+k]=cardPoints[i];
            sum+=cardPoints[i];
        }
        for(int i=0;i<k;i++) nums[k+i]=cardPoints[i];
        int i=0,j=k,maxSum=sum;
        while(j<nums.length) {
            sum=sum-nums[i]+nums[j];
            maxSum=Math.max(maxSum,sum);
            i++;
            j++;
        }
        return maxSum;
    }
}