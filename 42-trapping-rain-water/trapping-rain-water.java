class Solution {
    public int trap(int[] height) {
        int len=height.length,left=-1,right=-1;
        int[] leftMax=new int[len];
        int[] rightMax=new int[len];
        for(int i=0;i<len;i++) {
            int j=len-1-i;
            if(left<height[i]) left=height[i];
            leftMax[i]=left;
            if(right<height[j]) right=height[j];
            rightMax[j]=right;
        }
        int cnt=0;
        for(int i=0;i<len;i++) {
            if(height[i]<leftMax[i] && height[i]<rightMax[i]){
                int min=Math.min(leftMax[i],rightMax[i]);
                cnt+=min-height[i];
            }
        }
        return cnt;
    }
}