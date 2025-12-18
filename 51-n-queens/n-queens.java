class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0 ; i < n ; i++){
            Arrays.fill(board[i] , '.');
        }
        queen(res , n , board  , 0);
        return res;

    }
    public void queen(List<List<String>> res , int n , char[][] board , int r){
        if(n == r){
            List<String> cur = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                cur.add(new String(board[i]));
            }
            res.add(cur);
            return;
        }
        for(int c = 0 ; c < n ; c++){
            if(isSafe(board , n , r , c)){
                board[r][c] = 'Q';
                queen(res , n , board ,r + 1  );
                board[r][c] = '.';
            }
        }
    }
    public boolean isSafe(char[][] board , int n , int r , int c){
        for(int i = 0 ; i < n ; i++){
            if(board[i][c] == 'Q'){
                return false;
            }
        }
        int maxL = Math.min(r,c);
        int maxR = Math.min(r, n - c - 1);
        for(int i = 1 ; i <= maxL ; i++){
            if(board[r - i][c - i] == 'Q'){
                return false;
            }
        }
        for(int i = 1 ; i <= maxR ; i++){
            if(board[r - i][c + i] == 'Q'){
                return false;
            }
        }
        return true;
    }
}