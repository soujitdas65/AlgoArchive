class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        boolean[][] garden=new boolean[n][n];
        for(int[] i:paths) {
            garden[i[0]-1][i[1]-1]=true;
            garden[i[1]-1][i[0]-1]=true;
        }
        int[] flower=new int [n];
        return planting(garden,0,flower,n);
    }
    int[] planting(boolean[][] garden,int node,int[] flower,int n) {
        if(node==n) return flower;
        for(int i=1;i<=n;i++) {
            if(isPossible(garden,node,i,flower,n)) {
                flower[node]=i;
                break;
            }
        }
        return planting(garden,node+1,flower,n);
    }
    boolean isPossible(boolean[][] garden,int node,int type,int[] flower,int n) {
        for(int i=1;i<=n;i++) {
            if(garden[node][i-1] && flower[i-1]==type) return false;
        }
        return true;
    }
}