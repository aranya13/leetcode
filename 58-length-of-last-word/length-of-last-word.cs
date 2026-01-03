public class Solution {
    public int LengthOfLastWord(string s) {
        s.Trim();
        int Length = 0 ;
        for(int i = s.Length - 1 ; i >= 0 ; i--){
            if(s[i] != ' '){
                Length++;
            }
            else if(Length > 0){
                break;
            }
        }
        return Length;
    }
}