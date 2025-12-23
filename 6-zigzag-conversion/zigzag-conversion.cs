public class Solution {
    public string Convert(string s, int numRows) {
        if(numRows == 1){
            return s;
        }
        var sb = new StringBuilder[numRows];
        var c = 0 ; 
        var d = 1;
        for(int i = 0 ; i < sb.Length ; i++){
            sb[i] = new StringBuilder();
        }
        for(int i = 0 ; i < s.Length ; i++){
            sb[c].Append(s[i]);
            if(c == numRows - 1){
                d = -1;
            }
            else if(c == 0){
                d = 1;
            }
            c =c + d;
            
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < numRows ; i++){
            result.Append(sb[i]);
        }
        return result.ToString();
    }
}