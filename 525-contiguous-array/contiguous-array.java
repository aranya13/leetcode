class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer , Integer> mp= new HashMap<>();
        int sum = 0;
        int l = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                sum += -1;
            }
            else if(nums[i] == 1){
                sum += 1;
            }
            if(sum == 0){
                l = i + 1;
            }
            else if(mp.containsKey(sum)){
                l = Math.max(l , i - mp.get(sum));
            }
            else{
                mp.put(sum , i);
            }
        }
        return l;
    }
}