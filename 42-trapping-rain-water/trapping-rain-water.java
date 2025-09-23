class Solution {
    public int trap(int[] height) {
        int[] leftMax=new int[height.length];
        int[] rightMax=new int[height.length];
        leftMax[0]=height[0];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++) {
            int j=height.length-1-i;
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
            rightMax[j]=Math.max(height[j],rightMax[j+1]);
        }
        int cnt=0;
        for(int i=0;i<height.length;i++) {
            if(height[i]<leftMax[i] && height[i]<rightMax[i]){
                int min=Math.min(leftMax[i],rightMax[i]);
                cnt+=min-height[i];
            }
        }
        return cnt;
    }
}