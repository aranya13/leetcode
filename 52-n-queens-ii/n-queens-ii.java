class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queen(n , board , 0);
    }
    public static int queen(int n , boolean[][] board , int r){
        if(r == board.length){
            return 1;
        }
        int count = 0;
        for(int i = 0 ; i < board.length ; i++){
            if(isSafe(board ,r ,i)){
                board[r][i] = true;
                count += queen(n , board , r + 1);
                board[r][i] = false;
            }
        }
        return count;
    }
    private static boolean isSafe(boolean[][] board , int r , int c){
        for(int i = 0 ; i < r ; i++){
            if(board[i][c]){
                return false;
            }
        }
        int maxL = Math.min(r , c);
        for(int i = 1 ; i <= maxL ; i++){
            if(board[r - i][c - i]){
                return false;
            }
        }
        int maxR = Math.min(r , board.length - c -1);
        for(int i = 1 ; i <= maxR ; i++){
            if(board[r - i][c + i]){
                return false;
            }
        }
        return true;
    }
}