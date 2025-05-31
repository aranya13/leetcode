class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                sb.append(c);
                open++;
            } else if (c == ')' && open > 0) {
                sb.append(c);
                open--;
            } else if (c != ')') {
                sb.append(c);
            }
        }
        StringBuilder result = new StringBuilder();
        int close = 0;
        
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (c == ')') {
                result.append(c);
                close++;
            } else if (c == '(' && close > 0) {
                result.append(c);
                close--;
            } else if (c != '(') {
                result.append(c);
            }
        }
        
        return result.reverse().toString();
        
    }
}