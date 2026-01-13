class Solution {
    public int maximumSum(int[] arr) {
        int mnd = arr[0];
        int mod = arr[0];
        int result = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            int pnd = mnd;

            mnd = Math.max(mnd + arr[i] , arr[i]);
            mod = Math.max(mod + arr[i] , pnd);

            result = Math.max(result , Math.max(mnd , mod));
        }
        return result;
    }
}