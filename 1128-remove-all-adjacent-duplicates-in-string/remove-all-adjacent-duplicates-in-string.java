class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for(char c : s.toCharArray()){
            int size = stack.length();

            if(size > 0 && stack.charAt(size - 1) == c){
                stack.deleteCharAt(size - 1);
            }
            else{
                stack.append(c);
            }
        }
        return stack.toString();
    }
}