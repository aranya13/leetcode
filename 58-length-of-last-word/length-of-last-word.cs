public class Solution {
    public int LengthOfLastWord(string s) {
        return s.Trim().Length - s.Trim().LastIndexOf(" ") - 1;
    }
}