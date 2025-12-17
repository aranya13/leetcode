class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        HashMap<Character , String> digit = new HashMap<>();
        digit.put('2' , "abc");
        digit.put('3' , "def");
        digit.put('4' , "ghi");
        digit.put('5' , "jkl");
        digit.put('6' , "mno");
        digit.put('7' , "pqrs");
        digit.put('8' , "tuv");
        digit.put('9' , "wxyz");
        dfs(digits , digit , res , new StringBuilder() , 0);
        return res;
    }
    public void dfs(String digits ,HashMap<Character , String> digit , List<String> res , StringBuilder cur , int index){
        if(index == digits.length()){
            res.add(cur.toString());
            return;
        }
        char cd = digits.charAt(index);
        String let = digit.get(cd);

        for(char letter : let.toCharArray()){
            cur.append(letter);
            dfs(digits , digit , res , cur , index + 1);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}