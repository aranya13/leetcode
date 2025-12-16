class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        queen(res , n , 0 , board);
        return res;
    }
    public void queen(List<List<String>> res , int n , int r , boolean[][] board){
        if(r == board.length){
            res.add(construct(board));
            return;
        }
        
        for(int c = 0 ; c < board.length ; c++){
            if(isSafe(board , r, c)){
                board[r][c] = true;
                queen(res , n, r + 1 , board);
                board[r][c] = false;
            }
        }
    }
    private static boolean isSafe(boolean[][] board , int r , int c){
        for(int i = 0 ; i < r ;i++){
            if(board[i][c] == true){
                return false;
            }
        }
        int maxL = Math.min(r , c);
        for(int i = 1 ; i <= maxL ; i++){
            if(board[r - i][c - i] == true){
                return false;
            }
        }
        int maxR = Math.min(r , board.length - c - 1);
        for(int i = 1 ; i <= maxR ; i++){
            if(board[r - i][c + i] == true){
                return false;
            }
        }
        return true;
    }
    private List<String> construct(boolean[][] board){
        List<String> res = new ArrayList<>();
        for(int i = 0 ; i < board.length ; i++){
            StringBuilder row = new StringBuilder();
            for(int j = 0 ; j < board.length ; j++){
                if(board[i][j]){
                    row.append("Q");
                }
                else{
                    row.append(".");
                }
            }
            res.add(row.toString());
        }
        return res;
    }

}