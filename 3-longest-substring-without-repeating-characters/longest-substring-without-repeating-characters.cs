public class Solution {
    public int LengthOfLongestSubstring(string s) {
        HashSet<char> set = new HashSet<char>();
        int left = 0;
        int maxl = 0;
        int right = 0;
        while(right < s.Length){
            if(!set.Contains(s[right])){
                set.Add(s[right]);
                maxl = Math.Max(maxl , right - left + 1);
                right++;
            }
            else{
                set.Remove(s[left]);
                left++;
            }
        }
        return maxl;
    }
}