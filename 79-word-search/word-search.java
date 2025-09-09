class Solution {
    public boolean exist(char[][] board, String word) {
        //iterateThroughtTheMatrix
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(wordSearch(board,i,j,word,0)==true) return true;
            }
        }
        return false;
    }
    boolean wordSearch(char[][]board,int i,int j,String word,int k) {
        if(k==word.length()) return true;
        boolean flag=false;
        if(word.charAt(k)==board[i][j]){
            if(word.length()==1) return true;
            char temp=board[i][j];
            board[i][j]=' ';
            if(i>=1) flag=flag || wordSearch(board,i-1,j,word,k+1);
            if(j>=1) flag=flag || wordSearch(board,i,j-1,word,k+1);
            if(i<board.length-1) flag=flag || wordSearch(board,i+1,j,word,k+1);
            if(j<board[0].length-1) flag=flag || wordSearch(board,i,j+1,word,k+1);
            board[i][j]=temp;
        }
        return flag;
    }
}