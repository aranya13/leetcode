class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int a = nums[0] + nums[1] + nums[2];
        int b = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length - 2 ; i++){
            int l = i + 1;
            int r = nums.length - 1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == target){
                    return target;
                }
                if(sum < target){
                    l++;
                }
                else{
                    r--;
                }

                int c = Math.abs(sum - target);
                if(c < b){
                    a = sum;
                    b = c;
                }
            }
        }
        return a;
    }
}