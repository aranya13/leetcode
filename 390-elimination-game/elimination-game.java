class Solution {
    public int lastRemaining(int n) {
        return solve(n , true , 1 ,1);
    }
    private int solve(int r , boolean ltor , int h , int s){
        if(r == 1){
            return h;
        }
        if(ltor || r % 2 == 1){
            h = h + s;
        }
        return solve(r / 2, !ltor , h , s * 2);
    }
}