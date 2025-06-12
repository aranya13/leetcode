class Solution {
    public int countSegments(String s) {
        int count = 0;
        boolean inSegment = false;

        for(int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) != ' '){
                if(!inSegment){
                    count++;
                    inSegment = true;
                }    
            }
            else{
                    inSegment = false;
                }
        }
        return count;
    }
}