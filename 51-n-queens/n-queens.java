class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> nQueen=new ArrayList<>();
        String[][] board=new String[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]=".";
            }
        }
        placeQueen(nQueen,0,board,n);
        return nQueen;
    }
    void placeQueen(List<List<String>> nQueen,int j,String[][] board,int n) {
        if(j==n) {
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++) {
                StringBuilder str=new StringBuilder();
                for(int k=0;k<n;k++) str.append(board[i][k]);
                temp.add(str.toString());
            }
            nQueen.add(temp);
            return;
        }
        for(int i=0;i<n;i++) {
            if(isQueenSafe(i,j,board)) {
                board[i][j]="Q";
                placeQueen(nQueen,j+1,board,n);
                board[i][j]=".";
            }
        }
    }
    boolean isQueenSafe(int row,int col,String[][] board) {
        int i=row;
        int j=col;
        while(i>=0 && j>=0) {
            if(board[i][j]=="Q") return false;
            i--;
            j--;
        }
        i=row;
        j=col;
        while(j>=0) {
            if(board[i][j]=="Q") return false;
            j--;
        }
        i=row;
        j=col;
        while(i<board.length && j>=0) {
            if(board[i][j]=="Q") return false;
            i++;
            j--;
        }
        return true;
    }
}