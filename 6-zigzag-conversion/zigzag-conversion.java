class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        String[] rows = new String[numRows];
        for(int i = 0 ; i < numRows ; i++){
            rows[i] = "";
        }

        int row = 0 ;
        boolean flag = true;

        for(char c : s.toCharArray()){
            rows[row] += c;

            if(row == 0) flag = true;
            if(row == numRows - 1) flag = false;
            row += flag ? 1 : -1;
        }
        String result = "";
        for(String r : rows){
            result += r;
        }
        return result;

    }
}