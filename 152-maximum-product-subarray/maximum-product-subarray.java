class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int maxSum = nums[0];
        int min = nums[0];
        

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < 0){
                int t = maxSum;
                maxSum = min;
                min =t;
            }
            min = Math.min(nums[i] , min * nums[i]);
            maxSum = Math.max(nums[i], maxSum * nums[i]);
            ans = Math.max(ans , maxSum);
        }
        return ans;
    }
}