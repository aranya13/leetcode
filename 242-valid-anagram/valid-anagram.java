class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        String[] a = s.split("");
        String[] b = t.split("");

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0 ; i < s.length() ; i++){
            if(!a[i].equals(b[i])){
                return false;
            }
        }
        return true;
    }
}