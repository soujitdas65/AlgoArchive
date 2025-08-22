class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int top = 0, left = 0, bottom = m - 1, right = n - 1;
        while (top <= bottom && left <= right) {
            int sum=0;
            int count[]=new int[4];
            for (int i = left; i <= right; i++) {
                if (grid[top][i] == 1) count[0] = 1;
            }
            if (count[0] == 0) top++;
            for (int i = top; i <= bottom; i++) {
                if (grid[i][right] == 1) count[1] = 1;
            }
            if (count[1] == 0) right--;
            for (int i = right; i >= left; i--) {
                if (grid[bottom][i] == 1) count[2] = 1;
            }
            if (count[2] == 0) bottom--;
            for (int i = bottom; i >= top; i--) {
                if (grid[i][left] == 1) count[3] = 1;
            }
            if (count[3] == 0) left++;
            for(int i:count) {
                if(i==1) sum+=1;
            }
            if (sum==4) break;
        }
        return (bottom - top + 1) * (right - left + 1);
    }
}