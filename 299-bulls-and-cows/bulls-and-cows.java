class Solution {
    public String getHint(String secret, String guess) {
        int count = 0;
        char[] a = secret.toCharArray();
        char[] b = guess.toCharArray();
        int x = 0;
        for(int i = 0 ; i < secret.length() ;i++){
            if(a[i] == b[i]){
                x += 1;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i] == b[j]){
                count++;
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int y = count - x;

        return x + "A" + y + "B";
    }

}