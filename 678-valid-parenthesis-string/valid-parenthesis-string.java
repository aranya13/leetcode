class Solution {
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                min++;
                max++;
            }
            else if(c == ')'){
                min--;
                max--;
            }
            else{ // c == '*'
                min--;
                max++;
            }
            
            if(max < 0){
                return false;
            }
            min = Math.max(min, 0);
        }
        
        return min == 0;
    }
}