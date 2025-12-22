public class Solution {
    public int LengthOfLongestSubstring(string s) {
        HashSet<char> set = new HashSet<char>();
        int left = 0;
        int maxl = 0;
        for(int i = 0 ; i < s.Length ; i++){
            while(set.Contains(s[i])){
                set.Remove(s[left]);
                left++;
            }
            set.Add(s[i]);
            maxl = Math.Max(maxl , i - left + 1); 
        }
        return maxl;
    }
}