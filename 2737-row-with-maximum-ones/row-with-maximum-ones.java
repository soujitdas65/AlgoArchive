class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ans[]=new int[2];
        ans[1]=Integer.MIN_VALUE;ans[0]=-1;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }  
                if(count==mat[0].length)break;              
            }  
            if(count>ans[1]) {
                ans[1]=count;  
                ans[0]=i;
            } 
            if(count==mat[0].length)break;      
        }
        return ans;
    }
}