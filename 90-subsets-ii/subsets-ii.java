class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        sub(nums , res , new ArrayList<>() , 0);
        return res;
    }
    public void sub(int[] nums , List<List<Integer>> res  , List<Integer> temp , int start){
        res.add(new ArrayList<>(temp));
        for(int i = start ; i < nums.length ; i++){
            if(i > start && nums[i] == nums[i - 1]){
                continue;
            }
            temp.add(nums[i]);
            sub(nums , res , temp , i+ 1);
            temp.remove(temp.size() - 1);
        }
    }
}