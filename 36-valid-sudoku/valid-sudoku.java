class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        boolean[][] row = new boolean[n][n];
        boolean[][] col = new boolean[n][n];
        boolean[][] box = new boolean[n][n];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(board[i][j] == '.') continue;

                int num = board[i][j] - '1';
                int index = (i / 3) * 3 + (j / 3);
                if(row[i][num] || col[j][num] || box[index][num]) return false;

                row[i][num] = true;
                col[j][num] = true;
                box[index][num] = true;
            }
        }
        return true;

    }
}