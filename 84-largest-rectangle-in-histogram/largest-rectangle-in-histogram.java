class Solution {
    public int largestRectangleArea(int[] heights) {
        int len=heights.length;
        int[] pse=new int[len];
        Stack<Integer> left=new Stack<>();
        for(int i=0;i<heights.length;i++) {
            while(!left.empty() && heights[left.peek()]>=heights[i]) left.pop();
            pse[i]=(left.empty()) ? -1:left.peek();
            left.push(i);
        }
        int[] nse=new int[len];
        Stack<Integer> right=new Stack<>();
        for(int i=heights.length-1;i>=0;i--) {
            while(!right.empty() && heights[right.peek()]>=heights[i]) right.pop();
            nse[i]=(right.empty())? len:right.peek();
            right.push(i);
        }
        long largestArea=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++) {
            long breadth=(long)(nse[i]-pse[i]-1);
            long area=breadth*heights[i];
            largestArea=Math.max(area,largestArea);
        } 
        return (int)largestArea;
    }
}