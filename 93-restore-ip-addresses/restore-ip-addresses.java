class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        ip(s , res , new ArrayList<>() , 0);
        return res;
    }
    public void ip(String s , List<String> res , List<String> temp , int idx){
        if(temp.size() > 4){
            return;
        }
        if(idx == s.length() && temp.size() == 4){
            res.add(String.join(".", temp));
            return;
        }
        for(int i = idx ; i < s.length() ; i++){
            if(isSafe(s.substring(idx , i + 1))){
                temp.add(s.substring(idx , i + 1));
                ip(s , res , temp , i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
    public boolean isSafe(String s){
        if(s.length() > 3 || s.length() > 1 && s.charAt(0) == '0'){
            return false;
        }
        if(Integer.parseInt(s) > 255){
            return false;
        }
        return true;
    }
}