class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int x : nums) sum += x;

        if(sum % 2 != 0) return false;

        int target = sum / 2;
        boolean[] kp = new boolean[target + 1];
        kp[0] = true;
        for(int num : nums){
            for(int j = target ; j >= num ; j--){
                kp[j] = kp[j] || kp[j - num];
            }
        }
        return kp[target];
    }
}