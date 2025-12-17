class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        pp(res , s , new ArrayList<>() , 0);

        return res;
    }
    public void pp(List<List<String>> res , String s , List<String> temp , int start){
        if(start == s.length()){
            res.add(new ArrayList<>(temp));
        }
        for(int i = start ; i < s.length() ; i++){
            if(isPalind(s , start , i)){
                temp.add(s.substring(start , i + 1));
                pp(res , s , temp , i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
    public boolean isPalind(String s ,int low , int high){
        while(low < high){
            if(s.charAt(low++) != s.charAt(high--)){
                return false;
            }
        }
        return true;
    }
}