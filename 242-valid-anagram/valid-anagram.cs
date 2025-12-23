public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length){
            return false;
        }
        char[] a = s.ToCharArray();
        char[] b = t.ToCharArray();

        Array.Sort(a);
        Array.Sort(b);
        for(int i = 0 ; i < a.Length ; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}