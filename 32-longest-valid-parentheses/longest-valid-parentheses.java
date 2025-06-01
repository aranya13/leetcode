class Solution {
    public int longestValidParentheses(String s) {
        int maxlength = 0;
        Stack<Integer> stack = new Stack<>();

        stack.push(-1);

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if (c == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    maxlength = Math.max(maxlength , i - stack.peek());
                }
            }
            
        }
        return maxlength;
    }
}