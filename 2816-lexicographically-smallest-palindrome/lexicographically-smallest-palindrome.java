class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for(int i = 0 ; i < n/2 ; i++){
            int j = n-1-i;
            if(arr[i] != arr[j]){
                char smaller = (char)Math.min(arr[i],arr[j]);
                arr[i] = smaller;
                arr[j] = smaller;
            }
        }
        return new String(arr);
    }
}