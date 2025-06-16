class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }
    private boolean isPalindrome(String s){
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}