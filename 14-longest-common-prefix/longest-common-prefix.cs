public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        Array.Sort(strs);
        StringBuilder sb = new StringBuilder();
        String f = strs[0];
        String l = strs[strs.Length - 1];

        for(int i = 0 ; i < Math.Min(f.Length , l.Length) ; i++){
            if(f[i] != l[i]){
                return sb.ToString();
            }
            sb.Append(f[i]);
        }
        return sb.ToString();
    }
}