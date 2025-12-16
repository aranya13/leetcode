class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                if(board[i][j] == '.'){
                    for(char digit = '1' ; digit <= '9' ; digit++){
                        if(isSafe(board , i , j , digit)){
                            board[i][j] = digit;
                            if(solve(board)) return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSafe(char[][] board , int row , int col , char digit){
        for(int i = 0 ; i < board.length ; i++){
            if(board[i][col] == digit) return false;
            if(board[row][i] == digit) return false;
        }
        int s = (int)Math.sqrt(board.length);
        int rs = row - row % s;
        int cs = col - col % s;
        for(int i = 0 ; i < s ; i++){
            for(int j = 0 ; j < s ; j++){
                if(board[rs + i][cs + j] == digit) return false;
            }
        }
        return true;
    }

}