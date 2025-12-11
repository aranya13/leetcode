class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i -1]) continue;
            if(i + 2 < n && nums[i] + nums[i + 1] + nums[i + 2] > 0) break;

            int left = i + 1;
            int right = n -1;
            while(left < right){
                int s = nums[i] + nums[left] + nums[right];
                if(s == 0){
                    res.add(List.of(nums[i] , nums[left] , nums[right]));
                    left++; right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;

                }else if(s < 0) left++;
                else right--;
            }
        }
        return res;
    }
}