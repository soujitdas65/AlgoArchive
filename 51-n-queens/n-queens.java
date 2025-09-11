class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> nQueen=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]='.';
            }
        }
        placeQueen(nQueen,0,board,n);
        return nQueen;
    }
    void placeQueen(List<List<String>> nQueen,int j,char[][] board,int n) {
        if(j==n) {
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++) {
                temp.add(new String(board[i]));
            }
            nQueen.add(temp);
            return;
        }
        for(int i=0;i<n;i++) {
            if(isQueenSafe(i,j,board)) {
                board[i][j]='Q';
                placeQueen(nQueen,j+1,board,n);
                board[i][j]='.';
            }
        }
    }
    boolean isQueenSafe(int row,int col,char[][] board) {
        int i=row;
        int j=col;
        while(i>=0 && j>=0) {
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        i=row;
        j=col;
        while(j>=0) {
            if(board[i][j]=='Q') return false;
            j--;
        }
        i=row;
        j=col;
        while(i<board.length && j>=0) {
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        return true;
    }
}