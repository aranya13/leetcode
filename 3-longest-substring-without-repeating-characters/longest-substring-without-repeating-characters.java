class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> a = new HashSet<>();
        int max = 0;
        int l = 0;
        for(int r =0 ; r < s.length() ; r++){
            if(!a.contains(s.charAt(r))){
                a.add(s.charAt(r));
                max = Math.max(max , r - l + 1);
            }
            else{
                while(s.charAt(l) != s.charAt(r)){
                    a.remove(s.charAt(l));
                    l++;
                }
                a.remove(s.charAt(l));l++;
                a.add(s.charAt(r));
            }

        }
        return max;
    }
}