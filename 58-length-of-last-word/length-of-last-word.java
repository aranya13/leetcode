class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // Remove trailing spaces
        int lastSpace = s.lastIndexOf(' ');
        return s.length() - lastSpace - 1;
    }
}