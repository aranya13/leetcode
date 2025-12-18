class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return solve(expression);
    }
    public List<Integer> solve(String s){
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i  < s.length() ; i++){
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*'){
                List<Integer> left = solve(s.substring(0 , i));
                List<Integer> right = solve(s.substring(i + 1));
            
                for(int x : left){
                    for(int y : right){
                        if(s.charAt(i) == '+' ){
                            res.add(x + y);
                        }
                        if(s.charAt(i) == '-' ){
                            res.add(x - y);
                        }
                        if(s.charAt(i) == '*' ){
                            res.add(x * y);
                        }
                    }
                }
            }
        }
        if(res.isEmpty()){
            res.add(Integer.parseInt(s));
        }
        return res;
    }
}