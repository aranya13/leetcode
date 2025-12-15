class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;

        boolean[][] visited = new boolean[r][c];
        boolean res = false;

        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                if(board[i][j] == word.charAt(0)){
                    if(backtrack(board , word , visited , i , j , 0)){
                        return true;
                    }
                }
            }
        }
        return false;

    }
    public boolean backtrack(char[][] board , String word , boolean[][] visited,int i ,int j, int index){
        if(index == word.length()){
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)){
            return false;
        }
        visited[i][j] = true;

        if(backtrack(board , word , visited , i + 1 ,j ,index + 1)||
        backtrack(board , word , visited , i - 1 ,j ,index + 1) ||
        backtrack(board , word , visited , i ,j + 1 ,index + 1) ||
        backtrack(board , word , visited , i ,j -1 ,index + 1)
        ){
            return true;
        }
        visited[i][j] = false;
        return false;

    }
}