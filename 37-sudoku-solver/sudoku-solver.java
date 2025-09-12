class Solution {
    public void solveSudoku(char[][] board) {
        sudoku(board,0,0);
    }
    boolean sudoku(char[][] board,int i,int j) {
        if(j==board[0].length) {
            i++; 
            j=0;
        }
        if(i==board.length) return true;
        if(board[i][j]!='.') return sudoku(board,i,j+1);
        for(char ch='1';ch<='9';ch++) {
            if(possible(ch,board,i,j)) {
                board[i][j]=ch;
                if(sudoku(board,i,j+1)) return true;
                board[i][j]='.';
            }
        }
        return false;
    }
    boolean possible(char ch,char[][] board,int i,int j) {
        for(int k=0;k<9;k++) {
            if(board[i][k]==ch) return false;
        }
        for(int k=0;k<9;k++) {
            if(board[k][j]==ch) return false;
        } 
        int p=(i/3)*3;
        int q=(j/3)*3;
        for(int a=p;a<p+3;a++) {
            for(int b=q;b<q+3;b++) {
                if(board[a][b]==ch) return false;
            }
        }
        return true;
    }
}