class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        bt(res , n , 0 , 0 , "");
        return res;
    }
    public void bt(List<String> res , int n , int o , int c , String s){
        if(o == c && o + c == 2 * n){
            res.add(s);
            return;
        }
        if(o < n){
            bt(res,n,o +1, c ,s + "(");
        }
        if(c < o){
            bt(res , n , o , c + 1 , s + ")");
        }
    }
}