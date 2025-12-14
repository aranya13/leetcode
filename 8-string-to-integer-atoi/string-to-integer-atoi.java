class Solution {
    public boolean isDigit(char c){
        return c >= '0' && c <= '9';
    }
    public int myAtoi(String s) {
        s = s.trim(); //remove whitespace
        int i = 0;
        long num = 0;
        int sign = 1;
        if(i < s.length()){
            if(s.charAt(i) == '-'){
                sign = -1;
                i = i + 1;
            }
            else if(s.charAt(i) == '+'){
                i = i + 1;
            }
        }

        while(i < s.length() && isDigit(s.charAt(i))){
            int d = s.charAt(i) - '0';
            num = num * 10 + d;
            i = i + 1;

            if(sign * num > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign * num < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }

        return (int) (sign * num);

    }
}